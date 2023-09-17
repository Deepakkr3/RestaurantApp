
#  Mini RestaurantApp

We have created the basic structure  our RestaurantApp using  java,Spring Boot with MVC architecture 




 


## 🚀 About Me
I'm a full stack developer...

https://github.com/Deepakkr3
## Tech Stack

**Client:** HTML,CSS,JS

**Server:** Spring boot


## API Reference

#### put all items

```http
  @PostMapping("Restaurant")
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Required**. Your API input as body |

#### Get item

```http
  @GetMapping("Restaurants")
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Restauranta all te Restaurant it have in list |

#### all Restaurants

```http
@GetMapping("Resturent/{id}/id")
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Required id to fatch Restaurant from list |

#### matched Restaurants

```http
 @PutMapping("Resturent/update/id/{id}/address/{add}/api")
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Required id to update and  address |

#### matched id update the address



```http
@DeleteMapping("Resturent/{id}/Delete")
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Required id to Delete the Restaurant |

#### matched id Delete Restaurant









