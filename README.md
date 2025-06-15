# NBA Player Stats REST API

A Spring Boot REST API for managing NBA player statistics with full filtering, search and CRUD functionality.

## Features

- Full CRUD operations for NBA players
- Filter players by:
  - Team
  - Nation
  - Position
  - Name
  - Combined filters (team + position)
- Service and Repository layer separation
- PostgreSQL database integration
- DTO-based clean architecture
- Lombok for boilerplate reduction

## Tech Stack

- Java 23
- Spring Boot 3
- Spring Data JPA
- PostgreSQL
- Lombok
- Maven

## Endpoints

| HTTP Method | Path                     | Description                 |
|-------------|---------------------------|------------------------------|
| `GET`       | `/api/view1/player`       | Get all players              |
| `GET`       | `/api/view1/player?team={team}` | Filter by team |
| `GET`       | `/api/view1/player?name={name}` | Filter by name |
| `GET`       | `/api/view1/player?position={position}` | Filter by position |
| `GET`       | `/api/view1/player?nation={nation}` | Filter by nation |
| `POST`      | `/api/view1/player`       | Add new player               |
| `PUT`       | `/api/view1/player`       | Update existing player       |
| `DELETE`    | `/api/view1/player/{name}` | Delete player by name      |

## Database

PostgreSQL database with `player_statistic` table:

| Field           | Type      |
|------------------|-----------|
| player_name      | VARCHAR   |
| nation           | VARCHAR   |
| position         | VARCHAR   |
| age              | INTEGER   |
| games_played     | INTEGER   |
| game_starts      | INTEGER   |
| minutes_played   | INTEGER   |
| field_goals_made | INTEGER   |
| three_points     | INTEGER   |
| two_points       | INTEGER   |
| assists          | INTEGER   |
| steals           | INTEGER   |
| blocks           | INTEGER   |
| turnovers        | INTEGER   |
| points           | INTEGER   |
| team_name        | VARCHAR   |
