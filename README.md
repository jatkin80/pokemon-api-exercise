## Pokemon API

Still need to work through creating the link for individual pokePeople.

Link to deployed API https://julies-poke-api.herokuapp.com/api/pokemon

- Return individual pokemon in this format:

```json
{
  "id": 1,
  "name": "bulbasaur",
  "sprites": {
    "front_default": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png"
  }
}
```

- Create new pokemon
- Update existing pokemon
- Delete pokemon

Finally, create a README with a link to your deployed API.

## Success Criteria

- `GET` responses should conform to the provided standards
- Have routes for all CRUD-L actions
- All routes should follow RESTful conventions
- Spring Boot app should have at least one controller, service, repository, and model
- Database should be seeded with the 20 provided pokemon
- Errors should be handled
- App should be deployed to a cloud provider
- Database connection should use environment variables

## Starter Data

```json
[
  {
    "id": 1,
    "name": "bulbasaur",
    "front_default": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png"
  },
  {
    "id": 2,
    "name": "ivysaur",
    "front_default": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/2.png"
  },
  {
    "id": 3,
    "name": "venusaur",
    "front_default": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/3.png"
  },
  {
    "id": 4,
    "name": "charmander",
    "front_default": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/4.png"
  },
  {
    "id": 5,
    "name": "charmeleon",
    "front_default": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/5.png"
  },
  {
    "id": 6,
    "name": "charizard",
    "front_default": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/6.png"
  },
  {
    "id": 7,
    "name": "squirtle",
    "front_default": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/7.png"
  },
  {
    "id": 8,
    "name": "wartortle",
    "front_default": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/8.png"
  },
  {
    "id": 9,
    "name": "blastoise",
    "front_default": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/9.png"
  },
  {
    "id": 10,
    "name": "caterpie",
    "front_default": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/10.png"
  },
  {
    "id": 11,
    "name": "metapod",
    "front_default": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/11.png"
  },
  {
    "id": 12,
    "name": "butterfree",
    "front_default": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/12.png"
  },
  {
    "id": 13,
    "name": "weedle",
    "front_default": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/13.png"
  },
  {
    "id": 14,
    "name": "kakuna",
    "front_default": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/14.png"
  },
  {
    "id": 15,
    "name": "beedrill",
    "front_default": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/15.png"
  },
  {
    "id": 16,
    "name": "pidgey",
    "front_default": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/16.png"
  },
  {
    "id": 17,
    "name": "pidgeotto",
    "front_default": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/17.png"
  },
  {
    "id": 18,
    "name": "pidgeot",
    "front_default": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/18.png"
  },
  {
    "id": 19,
    "name": "rattata",
    "front_default": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/19.png"
  },
  {
    "id": 20,
    "name": "raticate",
    "front_default": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/20.png"
  }
]
```
