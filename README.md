# Cine World

Welcome to Cine World, a comprehensive platform for movie enthusiasts. This project was realized as part of the "Programming for the Web" course during the 2023 - 2024 academic year. It builds upon a previous school project developed on the **[Code.org](https://codeprojects.org/projects/weblab/oWZ1sXb3rGhatqboFaIh56AwPL4HncKjDDGfZTJVnk8/)** platform. The original project consisted solely of the frontend component, which has now been extended to include a fully functional backend, offering a more complete and robust application. The frontend was also enhanced to provide a better user experience.

## Technologies Used

- **[Java](https://www.java.com)** - A high-level, class-based, object-oriented programming language.
- **[Lombok](https://projectlombok.org)** - A Java library that automates the generation of boilerplate code like getters, setters, and constructors.
- **[Spring Boot](https://spring.io/projects/spring-boot)** - A framework for building stand-alone, production-grade Spring-based applications.
- **[Hibernate](https://hibernate.org)** - An ORM tool for mapping Java objects to a relational database.
- **[H2 Database](https://www.h2database.com)** - An open-source lightweight Java database.
- **[Gradle](https://gradle.org)** - An open-source build automation tool.
- **[HTML5](https://developer.mozilla.org/en-US/docs/Web/Guide/HTML/HTML5)** - The latest version of the HTML standard.
- **[CSS3](https://developer.mozilla.org/en-US/docs/Web/CSS)** - The latest version of the CSS standard.
- **[Thymeleaf](https://www.thymeleaf.org)** - A modern server-side Java template engine for web applications.
- **[JavaScript](https://developer.mozilla.org/en-US/docs/Web/JavaScript)** - A high-level, just-in-time compiled, multi-paradigm programming language.
- **[jQuery](https://jquery.com)** - A fast, small, and feature-rich JavaScript library.

## Functionalities

1. **Movie Reviews**
    - Provides detailed reviews for various movies.
    - Users can read in-depth critiques and opinions about movies.

2. **Movie News**
    - Latest news related to the movie industry.
    - Includes articles on upcoming movies, actor announcements, and industry events.

3. **Movie Rating**
    - Lists movies with their IMDb ratings and number of votes.
    - Sorting movies based on rating and number of votes to highlight the most popular and critically acclaimed films.

4. **Movie Premieres**
    - Displays a list of upcoming movie releases.
    - Information includes movie titles and release dates to help users keep track of upcoming films.

5. **Detailed Movie Information**
    - Each movie has a dedicated page showing detailed information including the director, release year, budget, box office earnings, IMDb rating, personal rating, trailer, and a detailed description.

6. **QR Code for Sharing**
    - Provides a QR code for users to share the project on GitHub.
    - Facilitates easy access to the project repository.

## Getting Started

To get a local copy up and running follow these simple steps:

### Prerequisites

- **[Java 17 or higher](https://www.oracle.com/java/technologies/downloads/#java17)**
    - Java is required to run the backend server. Ensure you have the correct version installed.

- **[Gradle](https://gradle.org/install/)**
    - Gradle is used to build the project. Follow the link for installation instructions.

- **[Modern Web Browser](https://www.google.com/chrome/)**
    - Any modern web browser like Google Chrome, Firefox, or Edge will work.

### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/Herman0802/CineWorld.git
   ```
2. Navigate to the project directory
   ```sh
   cd CineWorld
   ```
3. Build the project using Gradle
   ```sh
   ./gradlew build
   ```
4. Run the project
   ```sh
   ./gradlew bootRun
   ```

## Usage

Once the application is running, you can navigate to **[localhost:8080](http://localhost:8080)** to access the main website. Here are the specific URLs for different functionalities:

- **[Movie Reviews](http://localhost:8080/reviews)** - Browse detailed reviews of various movies.
- **[Latest News](http://localhost:8080/news)** - Stay updated with the latest news in the movie industry.
- **[Movie Ratings](http://localhost:8080/rating)** - View movie ratings based on user reviews and votes.
- **[Upcoming Premieres](http://localhost:8080/premieres)** - Check out the release dates of upcoming movies.
- **[Share](http://localhost:8080/share)** - Share the Cine World project via a QR code that links to the GitHub repository.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.
