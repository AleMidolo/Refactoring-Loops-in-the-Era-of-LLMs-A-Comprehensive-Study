# Refactoring Loops in the Era of LLMs: A Comprehensive Study

This repository contains the replication package for the paper *"Refactoring Loops in the Era of LLMs: A Comprehensive Study."*

---

## Repository Structure

The replication package consists of the following directories and files:

- **Results/**: contains all the results of the study, including code and output files.
- **src/**: contains all the Java files used to conduct the experiment.
- **target/**: contains the javadoc of the project
- **main.py**: contains the code that interacts with the GPT model to perform the refactoring.
- **pom.xml**: the Maven configuration file for the Java section of the experiment.
- **repositories.txt**: a text file listing the repositories analyzed.

---

## Prerequisites

- Java 17+
- Maven 3.6+
- Python 3.8+
- Python packages: `openai` (or any other required package for GPT interaction)

---

## Experiment Configuration

The experiment can be divided into three main steps:

### 1. Extraction and Categorization of `for` Loops

1. Edit the **repositories.txt** file by adding the repositories to be analyzed. Currently, the file contains the repositories analyzed in the paper.
2. Before starting the experiment, clone the repositories listed in this file into a directory named **AnalyzedRepositories/**, located in the root of the project. This directory will be used during the analysis.
3. Run the following command to extract and categorize all `for` loops:

```bash
mvn compile exec:java -Dexec.args="0"
```

The output will be saved in the **Results/CATEGORIES/** directory.

---

### 2. Stream Pipeline Generation

Run the **main.py** script with the following command:

```bash
python main.py
```

The script will read all `for` loops from **Results/CATEGORIES/** and generate the corresponding stream pipelines by querying the GPT model. The generated output will be saved in the **Results/GENERATED/** directory.

---

### 3. Validation of Generated Streams

Run the following command to validate the generated streams:

```bash
mvn compile exec:java -Dexec.args="1"
```

This step injects the generated streams into the repositories and attempts to compile them to verify that the streams are syntactically correct.

---

## Notes

- Make sure the **AnalyzedRepositories/** directory is located in the root of the project before starting the experiment.
- All output files are stored in the **Results/** directory for easy inspection.
- For more details, refer to the paper associated with this replication package.
