# MovieTicket

A Hibernate ORM practice project that models a simple movie ticket booking system with **multiple related tables** — my first project working with entity relationships in Hibernate.

## Schema

Three tables, connected through a bidirectional many-to-one / one-to-many mapping:

- **Customer** (`customer`) — customer details
- **Movies** (`movies`) — movie details and ticket price
- **Bookings** (`bookings`) — each booking links one `Customer` to one `Movies`, so:
  - `Customer` → `Bookings` : one-to-many
  - `Movies` → `Bookings` : one-to-many
  - `Bookings` → `Customer` / `Movies` : many-to-one

## Tech stack

- Java
- Hibernate 6 (core, XML mapping via `.hbm.xml`)
- MySQL (via `mysql-connector-java`)
- Maven

## Project structure

```
src/main/java/com/rajesh/Entity/   Customer, Movies, Bookings entity classes
src/main/java/com/rajesh/main/     Main.java - Hibernate SessionFactory bootstrap
src/main/resources/                *.hbm.xml mapping files + hibernate.cfg.xml
```

## Setup

1. Create a MySQL database matching the URL in `src/main/resources/hibernate.cfg.xml`.
2. Update the `connection.username` / `connection.password` in that file to match your local MySQL setup.
3. Run `Main.java` — `hbm2ddl.auto=create` will generate the `customer`, `movies`, and `bookings` tables automatically.
