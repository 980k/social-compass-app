# Social Compass App

## Description
A mobile application on Android that bridges the distance between friends and family, near and far. Exchange IDs with friends and family to instantly connect and gauge their location relative to yours. Feel more connected to your community and never lose contact with those close to you again! 👤🌎📍🧭📱

## Features
- **Shareable user IDs**: Unique IDs for users that can be shared with others to connect and be visible on each other's compasses.
- **Compass**: Users are represented on a compass based on their direction and distance. See everyone's general location and the distance relative to yours.
- **Zoom in/Zoom out**: Zoom in to get a more detailed view on those close to you. Zoom out for those further from you.
- **Connection indicator**: Keep track of the app's connections and disconnections to ensure accurate information is displayed.

## Technologies
### Framework
- **Android**

### Frontend
- **XML**, **Java**

### Backend
- **Java**, **SQL**, **SQLite (RoomDB)**

### External API
- **Google Geolocation API**

## Methodology
### Framework
- **Android**
    - Android is the primary framework on which the application is built on, targeting android devices.
    - Utilized various android-specific libraries and assets for building frontend/backend components and testing features.
    - Utilized position sensors to determine device orientation for compass functionality.

### Frontend
- **XML**
    - The UI was developed using views, where XML is the underlying language.
    - Responsible for the layout and all visual components in the application.

- **Java**
    - Java was used on the frontend for handling client-side events such as:
        - Button clicks
        - Compass updates
        - Indicator changes

### Backend
- **Java**
    - Java was used on the backend for:
        - CRUD operations into the database.
        - Pulling data from a server endpoint via API.
        - Creating utilities for various features.
        - Dependency injection to promote loose coupling with the database.

- **SQL**
    - Wrote raw SQL queries to specify how to handle CRUD operations.
    - Used mainly in the Data Access Object models.

- **SQLite**
    - Utilized Android's room database, which is an abstraction of SQLite.
    - Enabled data persistence in the application.

### External API
- **Google Geolocation API**
    - Utilized to determine the location of the users.
    - Information was used for calculating the distance and position for placement on the compass.

## Screenshots
