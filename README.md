# An album provider based on the Spotify API

This API aims to provide the new albums released by spotify

## Technologies
* [Gradle](https://gradle.org)
* [Spring Boot 3](https://spring.io)
* [OpenFeign](https://spring.io/projects/spring-cloud-openfeign)

## Getting Started
To get started with this project, you will need to have the following installed on your local machine:

* JDK 17+

**To build and run the project, follow these steps:**

1. Clone the repository: `git clone https://github.com/lemuel-sousa/albums-spotify.git`
2. Navigate to the project directory: `cd good-api`
3. Build the project: `./gradlew clean bootjar`
4. Run the project: `java -jar app/build/libs/app.jar`

-> The application will be available at http://localhost:8080.

## Routes
* Get new albums releases `/spotify/api/albums`
```json
{
  "albums": {
    "items": [
      {
        "id": "4dSYs3xICrNR4Mob4nn3Sa",
        "name": "BRUXARIA 3000",
        "release_date": "2023-10-26",
        "artists": [
          {
            "id": "7rXMvXRnWHaSwnVvPeUUfw",
            "name": "Gloria Groove"
          },
          {
            "id": "0TLNtcIt6Lyu1g22EDhwe1",
            "name": "Mc Aleff"
          },
          {
            "id": "3g1NhInk2OwAa1UNhBgWiS",
            "name": "Yure IDD"
          }
        ]
      }
    ]
  }
}
```
