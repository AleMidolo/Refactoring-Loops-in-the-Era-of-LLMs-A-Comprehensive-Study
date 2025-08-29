from openai import OpenAI
from colorama import Fore, Style
import os

client = OpenAI(api_key="")

def ask_Gpt(code):

    systemPrompt = "You are a software developer, skilled in writing Java source code and refactoring for loops into stream-based code"
    userPrompt = f"Please refactor this code to use streams, and provide only the Java code without any markdown, explanation, or comments: {code}"

    completion = client.chat.completions.create(
        model="gpt-3.5-turbo-0125",
        messages=[
            {"role": "system", "content":systemPrompt},
            {"role": "user", "content": userPrompt}
        ]
    )

    message = completion.choices[0].message.content
    print(f"{Fore.LIGHTBLUE_EX}{message}{Style.RESET_ALL}\n")
    return message

def main():
    dir = "./Results/CATEGORIES"
    output_dir = "./Results/GENERATED"

    java_files = []
    for root, _, files in os.walk(dir):
        for file in files:
            if file.endswith(".java"):
                java_path = os.path.join(root, file)
                print(f"Found Java file: {java_path}")

                # Compute relative path from CATEGORIES
                rel_path = os.path.relpath(java_path, dir)

                # Full output path in GENERATED
                generated_path = os.path.join(output_dir, rel_path)

                # Ensure output directories exist
                os.makedirs(os.path.dirname(generated_path), exist_ok=True)

                # Read the original Java code
                with open(java_path, "r", encoding="utf-8") as f:
                    java_code = f.read()

                # Ask GPT to refactor the code
                new_code = ask_Gpt(java_code)

                # Write the new code to the GENERATED folder
                with open(generated_path, "w", encoding="utf-8") as f:
                    f.write(new_code)

if __name__ == "__main__":
    main()