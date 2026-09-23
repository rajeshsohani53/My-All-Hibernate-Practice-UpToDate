# MyHibernatePracticeDay02

A small practice project for learning Hibernate ORM with MySQL.

## Overview

Maps a `ClothingBrands` entity to a MySQL table using Hibernate's XML mapping
(`hbm.xml`) and persists a sample record via `SessionFactory`.

## Tech Stack

- Java
- Hibernate Core 6.3.1.Final
- MySQL Connector/J 8.0.33
- Maven

## Project Structure

```
src/main/java/com/rajesh/Entity/ClothingBrands.java   # Entity class
src/main/java/com/rajesh/Main/Application.java        # Entry point
src/main/resources/hibernate.cfg.xml                  # Hibernate/DB config
src/main/resources/ClothingBrands.hbm.xml              # ORM mapping
```

## Setup

1. Create a MySQL database named `hibernatedb`.
2. Update the credentials in `src/main/resources/hibernate.cfg.xml` to match
   your local MySQL setup.
3. Build and run:

   ```
   mvn compile exec:java -Dexec.mainClass="com.rajesh.Main.Application"
   ```

Hibernate is configured with `hbm2ddl.auto=update`, so the `ClothingBrands`
table is created/updated automatically on startup.
