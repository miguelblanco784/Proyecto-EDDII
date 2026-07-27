# Academic Research Management System

A Java-based academic project created to manage structured information about degree programs, researchers, research projects, and publications.

The project explores data organization, record design, entity relationships, and persistent storage while providing a practical interface for maintaining academic research information.

## Main features

- Manage degree programs and their status
- Register researchers and associate them with academic programs
- Create and maintain research projects
- Record publications connected to research projects
- Store structured records using defined field sizes
- Preserve data through local project files
- Handle dates and status-based record management

## Data model

The application works with four primary entities:

- **Degree Programs** — code, name, and status
- **Researchers** — code, name, admission date, academic program, and status
- **Projects** — code, topic, researcher, start date, end date, and status
- **Publications** — code, related project, date, and journal or conference

## Technologies

- Java
- Java Swing
- Apache Ant
- NetBeans
- JCalendar
- File-based data persistence

## Project structure

```text
src/proyecto/eddii/   Java source code
nbproject/            NetBeans project configuration
*.txt                 Persistent project data
build.xml             Ant build configuration
```

## Running the project

1. Clone the repository.
2. Open it as an existing project in NetBeans.
3. Confirm that the included JAR dependencies are available.
4. Build and run the project from the IDE or with Apache Ant.

## Academic context

This repository is preserved as an academic learning project focused on data structures, structured records, persistence, and Java application development.

## License

This project is available under the MIT License.
