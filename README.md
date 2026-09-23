# My All Hibernate Practice (Up To Date)

A collection of Hibernate ORM practice projects built while learning Java, Hibernate and MySQL. Each folder is a standalone Maven project.

## Tech Stack

- Java
- Hibernate ORM (5.6.15 in `HIbernate01`, 6.3.1.Final in the rest)
- MySQL 8 (Connector/J)
- Maven
- Servlets / JSP + Tomcat 10.1 (`Hibernate03`)

## Projects

| Project | What it practices |
|---|---|
| `HIbernate01` | First Hibernate project: `Student` entity with a `HibernateUtil` session factory helper |
| `Example` | Basic entity mapping with `Trainers` and `Temp` entities |
| `HIbernatePractice` | `ClothingBrands` entity mapped with XML (`hbm.xml`) and saved through `SessionFactory` |
| `CyberSucessVegRestro` | `Menu` entity for a vegetarian restaurant menu |
| `JobRequirement` | `Job` entity with a DAO layer and CRUD operations (`CurdOperation`, `EmployeDao`) |
| `VehicalRegistration` | `VehicalRegistration` entity with a DAO and `SessionProvider` |
| `OneToOneMapping02` | Bidirectional **One-to-One** mapping between `Person` and `Aadhar` |
| `MovieTicket` | `Customer`, `Movies` and `Bookings` entities with DAOs and **HQL** queries (filtering, aggregate stats) |
| `HibernateFestivalProject` | **HQL** practice (`HQL01`–`HQL7`) on a `Festival` entity |
| `Hibernate03` | Maven Servlet + JSP + Hibernate skeleton (`User` entity, `UserDao`, `UserServlet`) |
| `Servers` | Tomcat v10.1 server configuration files |

## Topics Covered

- Entity mapping with annotations and `hbm.xml`
- `hibernate.cfg.xml` configuration and `SessionFactory` setup
- CRUD operations with `Session` and `Transaction`
- DAO pattern
- One-to-One relationships
- HQL: select with conditions, aggregates, parameter binding

## Getting Started

1. Install JDK, Maven and MySQL.
2. Create a MySQL database and update the URL, username and password in the project's `src/main/resources/hibernate.cfg.xml`.
3. Open the project folder you want, then build and run:

   ```
   cd OneToOneMapping02
   mvn clean compile
   ```

4. Run the `Main` / `Application` class from your IDE (Eclipse or IntelliJ).

## Note

`hibernate.cfg.xml` files contain local development database credentials. Change them to your own before running, and don't reuse them for anything real.

## Author

Rajesh Sohani
