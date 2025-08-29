import os
import hashlib

def shorten_filenames(root_dir, max_length=100):
    """
    Shortens Java filenames in root_dir and subdirectories.
    Keeps only the class name (after the last dot) and .java extension.
    Adds a short hash if necessary to avoid collisions.
    """
    for dirpath, dirnames, filenames in os.walk(root_dir):
        for filename in filenames:
            if filename.endswith(".java"):
                name, ext = os.path.splitext(filename)
                # Keep only the class name (after last dot)
                class_name = name.split('.')[-1]

                # Add a short hash of the original name to avoid collisions
                hash_digest = hashlib.md5(name.encode()).hexdigest()[:6]
                new_name = f"{class_name}_{hash_digest}{ext}"

                new_path = os.path.join(dirpath, new_name)
                counter = 1

                # Ensure unique filename
                while os.path.exists(new_path):
                    new_name = f"{class_name}_{hash_digest}_{counter}{ext}"
                    new_path = os.path.join(dirpath, new_name)
                    counter += 1

                old_path = os.path.join(dirpath, filename)
                print(f"Renaming:\n{old_path}\n   -> {new_path}\n")
                os.rename(old_path, new_path)

# Replace with your root directory
shorten_filenames("Results")
