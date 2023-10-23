# Countries & Cities API

The Countries & Cities API provides information about countries and cities around the world.

# Countries API

The Countries API provides information about countries around the world.

## Endpoints

### Get All Countries

- **Endpoint:** `/api/countries/list`
- **Method:** GET
- **Description:** Retrieve a list of all countries.

### Get All Country Names

- **Endpoint:** `/api/countries/name`
- **Method:** GET
- **Description:** Retrieve a list of country names.

### Search Countries by Name

- **Endpoint:** `/api/countries/search/{name}`
- **Method:** GET
- **Description:** Search for countries by name, supporting partial matching.

### Save Countries Data

- **Endpoint:** `/api/countries/save`
- **Method:** GET
- **Description:** Save country data to the database.

## Usage

You can use the Countries API to access information about countries. Here are some example use cases:

### Get a List of All Countries

**Request:**

# Cities API

The Cities API allows you to access information about cities around the world.

## Endpoints

### Get All Cities

- **Endpoint:** `/api/cities/list`
- **Method:** GET
- **Description:** Retrieve a list of all cities.

### Search Cities by Name

- **Endpoint:** `/api/cities/search/{name}`
- **Method:** GET
- **Description:** Search for cities by name, supporting partial matching.

### Save Cities Data

- **Endpoint:** `/api/cities/save`
- **Method:** GET
- **Description:** Save city data to the database.

**Request:**

```http
GET /api/countries
