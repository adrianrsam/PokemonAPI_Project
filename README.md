Pokemon API Project

This is a Spring Boot REST API that retrieves Pokémon details from the PokéAPI and returns key information such as name, ID, height, weight, and types.

How to Use
Step 1: Open the project in IntelliJ IDEA.
Step 2: Run the main application file
Step 3: Once the server starts, the API will be available at: http://localhost:8080

You can request any Pokémon by name. For example: http://localhost:8080/pokemon?name=pikachu

Example Response:
{
    "name": "pikachu",
    "id": 25,
    "height": 4,
    "weight": 60,
    "types": ["electric"]
}
