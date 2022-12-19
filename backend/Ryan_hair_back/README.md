# Ryan Hair

A brief description of what this project does and who it's for

* **c'est l'admin qui gère les fermetures exceptionnelles et les congés**

* **l'admin et/ou le coiffeur ferent les prises de rdv**

* **Timeslot : liste de créneaux disponibles**

proposition amélioration :
les absences gérées par utilisateur avec role admin. il doit pouvoir voir toutes les absecnces,
une absences en particulier
lister toutes les absences en fonction du role

role de l'admin :
gère les fermetures exceptionnelles et les congés
gère ses rdv
ne peux pas créer un autre admin

role du coiffeur :
gère ses rdv
---

---

## API Reference

# Haircut
**Get all haircuts**
----
Returns array json data.

* **URL**

      api/haircuts


* **url Params** : **Required**: None

* **Data Params** : None

* **Success Response:**

    * **Code:** 200 OK  
      **Content:**

          {
          "id":1,
          "haircutStatus":" ",
          A COMPLETER
          };

          { 
          "id":2,
          "A COMPLETER,
          }

* **Sample Call:**

  ```javascript
    fetch.ajax({
      url: "api/haircuts",
      dataType: "json",
      type : "GET",
      success : function(response) {
        console.log(response);
      }
    });
  ```        
---


**Get haircut by id**
----
Returns json data about a single haircut.

* **URL**

      api/haircuts/:id

* **Method:**

  `GET`

*  **URL Params**

   **Required:**

   `id=[Long]`

* **Data Params**

  None

* **Success Response:**

    * **Code:** 200  
      **Content:**
      ```json
        { 
          "id":1,
          "A COMPLETER": "",
          " ":" "
        }
      ```

* **Error Response:**

    * **Code:** 404 NOT FOUND  
      **Content:** `null`



* **Sample Call:**

  ```javascript
    fetch({
      url: "api/haircuts/1",
      dataType: "json",
      type : "GET",
      success : function(response) {
        console.log(response);
      }
    });
  ```


**Add haircut**
----
Save a single haircut in the data base.

* **URL**

      api/haircuts

* **Method:**

  `POST`

*  **URL Params**

   None

* **Data Params**

  ```json
    {
      "A COMPLETER":"A COMPLETER",
      "A COMPLETER":"A COMPLETER"
    }
  ```

* **Success Response:**

    * **Code:** 201 CREATED  
      **Content:**
      ```json
        {
          "id":1,
          "A COMPLETER": ""
        }
      ```

* **Sample Call:**

  ```javascript
    fetch({
      url: "api/haircuts",
      dataType: "json",
      type : "POST",
      success : function(response) {
        console.log(response);
      }
    });
  ```


**Update haircut**
----
Update json data about a single haircut.

* **URL**

      api/haircuts/:id

* **Method:**

  ` PUT`

*  **URL Params**

   **Required:**

   `id=[Long]`

* **Data Params**

  ```json
    {
      "A COMPLETER": ""
    }
  ```

* **Success Response:**

    * **Code:** 201 CREATED  
      **Content:**
      ```json
        {
          "id":1,
          "A COMPLETER": ""
        }
      ```

* **Error Response:**

    * **Code:** 404 NOT FOUND  
      **Content:** `null`

* **Sample Call:**

  ```javascript
    fetch({
      url: "api/haircuts/1",
      dataType: "json",
      type : "PUT",
      success : function(response) {
        console.log(response);
      }
    });
  ```
**Delete haircut**
----
Delete json data about a single haircut.

* **URL**

      api/haircuts/:id

* **Method:**

  `DELETE`

*  **URL Params**

   **Required:**

   `id=[Long]`

* **Data Params**

  None

* **Success Response:**

    * **Code:** 200 OK  
      **Content:** `{ error : "A COMPLETER" }`


* **Sample Call:**

  ```javascript
    fetch({
      url: "api/haircuts/1",
      dataType: "json",
      type : "DELETE",
      success : function(response) {
        console.log(response);
      }
    });
  ```

# Timeslot
**Get all timeslots**
----
Returns array json data.

* **URL**

      api/timeslots


* **url Params** : **Required**: None

* **Data Params** : None

* **Success Response:**

    * **Code:** 200 OK  
      **Content:**

          {
          "id":1,
          "timeslotStart":"2022-01-01 09:30:00",
          "timeslotEnd":"2022-01-01 10:45:00"
          };

          { 
          "id":2,
          "timeslotStart":"2022-01-01 10:45,
          "timeslotEnd":"2022-12-25 11:30"
          }

* **Sample Call:**

  ```javascript
    fetch.ajax({
      url: "api/timeslots",
      dataType: "json",
      type : "GET",
      success : function(response) {
        console.log(response);
      }
    });
  ```        
---


**Get timeslot by id**
----
Returns json data about a single timeslot.

* **URL**

      api/timeslots/:id

* **Method:**

  `GET`

*  **URL Params**

   **Required:**

   `id=[Long]`

* **Data Params**

  None

* **Success Response:**

    * **Code:** 200  
      **Content:**
      ```json
        { 
          "id":1,
          "timeslotStart":"2022-01-01 09:30:00",
          "timeslotEnd":"2022-01-01 10:45:00"
        }
      ```

* **Error Response:**

    * **Code:** 404 NOT FOUND  
      **Content:** `null`



* **Sample Call:**

  ```javascript
    fetch({
      url: "api/timeslots/1",
      dataType: "json",
      type : "GET",
      success : function(response) {
        console.log(response);
      }
    });
  ```


**Add timeslot**
----
Save a single timeslot in the data base.

* **URL**

      api/timeslots

* **Method:**

  `POST`

*  **URL Params**

   None

* **Data Params**

  ```json
    {
      "timeslotStart":"2022-01-01 09:30:00",
      "timeslotEnd":"2022-01-01 10:45:00"
    }
  ```

* **Success Response:**

    * **Code:** 201 CREATED  
      **Content:**
      ```json
        {
          "id":1,
          "timeslotStart":"2022-01-01 09:30:00",
          "timeslotEnd":"2022-01-01 10:45:00"
        }
      ```

* **Sample Call:**

  ```javascript
    fetch({
      url: "api/timeslots",
      dataType: "json",
      type : "POST",
      success : function(response) {
        console.log(response);
      }
    });
  ```


**Update timeslot**
----
Update json data about a single timeslot.

* **URL**

      api/timeslots/:id

* **Method:**

  ` PUT`

*  **URL Params**

   **Required:**

   `id=[Long]`

* **Data Params**

  ```json
    {
      "timeslotStart":"2022-01-01 09:30:00",
      "timeslotEnd":"2022-01-01 10:45:00"
    }
  ```

* **Success Response:**

    * **Code:** 201 CREATED  
      **Content:**
      ```json
        {
          "id":1,
          "timeslotStart":"2022-01-01 09:30:00",
          "timeslotEnd":"2022-01-01 10:45:00"
        }
      ```

* **Error Response:**

    * **Code:** 404 NOT FOUND  
      **Content:** `null`

* **Sample Call:**

  ```javascript
    fetch({
      url: "api/timeslots/1",
      dataType: "json",
      type : "PUT",
      success : function(response) {
        console.log(response);
      }
    });
  ```
**Delete timeslot**
----
Delete json data about a single timeslot.

* **URL**

      api/timeslots/:id

* **Method:**

  `DELETE`

*  **URL Params**

   **Required:**

   `id=[Long]`

* **Data Params**

  None

* **Success Response:**

    * **Code:** 200 OK  
      **Content:** `{ error : "Le créneau de fermeture exceptionnelle a été supprimé" }`


* **Sample Call:**

  ```javascript
    fetch({
      url: "api/timeslots/1",
      dataType: "json",
      type : "DELETE",
      success : function(response) {
        console.log(response);
      }
    });
  ```
---


# Closure
**Get all closures**
----
Returns array json data.

* **URL**

      api/closures


* **url Params** : **Required**: None

* **Data Params** : None

* **Success Response:**

    * **Code:** 200 OK  
      **Content:**

          {
          "id":1,
          "ClosureStart":"2022-12-25 09:30",
          "ClosureEnd":"2022-12-25 13:30"
          };

          { 
          "id":2,
          "ClosureStart":"2022-12-25 13:30",
          "ClosureEnd":"2022-12-25 18:00"
          }

* **Sample Call:**

  ```javascript
    fetch.ajax({
      url: "api/closures",
      dataType: "json",
      type : "GET",
      success : function(response) {
        console.log(response);
      }
    });
  ```        
---

**Get closure by id**
----
Returns json data about a single closure.

* **URL**

      api/closures/:id

* **Method:**

  `GET`

*  **URL Params**

   **Required:**

   `id=[Long]`

* **Data Params**

  None

* **Success Response:**

    * **Code:** 200  
      **Content:**
      ```json
        { 
          "id":1,
          "ClosureStart":"2022-12-25 09:30:00",
          "ClosureEnd":"2022-12-25 13:30:00"
        }
      ```

* **Error Response:**

    * **Code:** 404 NOT FOUND  
      **Content:** `null`



* **Sample Call:**

  ```javascript
    fetch({
      url: "api/closures/1",
      dataType: "json",
      type : "GET",
      success : function(response) {
        console.log(response);
      }
    });
  ```


**Add closure**
----
Save a single closure in the data base.

* **URL**

      api/closures

* **Method:**

  `POST`

*  **URL Params**

   None

* **Data Params**

  ```json
    {
      "ClosureStart":"2022-12-25 09:30:00",
      "ClosureEnd":"2022-12-25 13:30:00"
    }
  ```

* **Success Response:**

    * **Code:** 201 CREATED  
      **Content:**
      ```json
        {
          "id":1,
          "ClosureStart":"2022-12-25 09:30:00",
          "ClosureEnd":"2022-12-25 13:30:00"
        }
      ```

* **Sample Call:**

  ```javascript
    fetch({
      url: "api/closures",
      dataType: "json",
      type : "POST",
      success : function(response) {
        console.log(response);
      }
    });
  ```


**Update closure**
----
Update json data about a single closure.

* **URL**

      api/closures/:id

* **Method:**

  ` PUT`

*  **URL Params**

   **Required:**

   `id=[Long]`

* **Data Params**

  ```json
    {
      "ClosureStart":"2022-12-25 09:30:00",
      "ClosureEnd":"2022-12-25 13:30:00"
    }
  ```

* **Success Response:**

    * **Code:** 201 CREATED  
      **Content:**
      ```json
        {
          "id":1,
          "ClosureStart":"2022-12-25 09:30:00",
          "ClosureEnd":"2022-12-25 13:30:00"
        }
      ```

* **Error Response:**

    * **Code:** 404 NOT FOUND  
      **Content:** `null`

* **Sample Call:**

  ```javascript
    fetch({
      url: "api/closures/1",
      dataType: "json",
      type : "PUT",
      success : function(response) {
        console.log(response);
      }
    });
  ```
**Delete closure**
----
Delete json data about a single closure.

* **URL**

      api/closures/:id

* **Method:**

  `DELETE`

*  **URL Params**

   **Required:**

   `id=[Long]`

* **Data Params**

  None

* **Success Response:**

    * **Code:** 200 OK  
      **Content:** `{ error : "Le créneau de fermeture exceptionnelle a été supprimé" }`


* **Sample Call:**

  ```javascript
    fetch({
      url: "api/closures/1",
      dataType: "json",
      type : "DELETE",
      success : function(response) {
        console.log(response);
      }
    });
  ```

---


# Appointment
**Add appointment**
----
Save a single appointment in the data base.

* **URL**

      api/appointments

* **Method:**

  `POST`

*  **URL Params**

   None

* **Data Params**

```json
    {
      "firstName":"Coralie",
      "lastName":"Bordenave",
      "telephone":"0534546678",
      "email":"coralie@gmail.com",
      "comment":"je déteste tout ce qui n'a pas de couleur",
      "haircut": {"id":1},
      "timeSlot": {"id":3}
    }
  ```

* **Success Response:**

    * **Code:** 201 <br />
      **Content:**
      ```json
        {
          "id":1,
          "firstName":"Coralie",
          "lastName":"Bordenave",
          "telephone":"0534546678",
          "email":"coralie@gmail.com",
          "comment":"je déteste tout ce qui n'a pas de couleur",
          "timeSlot": 
                     {
                        "id": 3,
                        "slotStart": null,
                        "slotEnd": null
                      }
        }
      ```

* **Error Response:**

    * **Code:** 400 BAD REQUEST <br />
      **Content:** `{ error : "Requête invalide" }`

* **Sample Call:**

  ```javascript
    fetch({
      url: "api/appointments",
      dataType: "json",
      type : "POST",
      success : function(response) {
        console.log(response);
      }
    });
  ```

**Get appointment by id**
----
Returns json data about a single appointment.

* **URL**

      api/appointments/:id

* **Method:**

  `GET`

*  **URL Params**

   **Required:**

   `id=[Long]`

* **Data Params**

  None

* **Success Response:**

    * **Code:** 200 <br />
      **Content:**
      ```json
        {
          "id":1,
          "firstName":"Coralie",
          "lastName":"Bordenave",
          "telephone":"0534546678",
          "email":"coralie@gmail.com",
          "comment":"je déteste tout ce qui n'a pas de couleur",
          "timeSlot": 
                     {
                        "id": 3,
                        "slotStart": null,
                        "slotEnd": null
                      }
        }
      ```
* **Error Response:**

    * **Code:** 404 NOT FOUND <br />
      **Content:** `{ error : "Ce appointment n'existe pas" }`



* **Sample Call:**

  ```javascript
    fetch({
      url: "/appointment/1",
      dataType: "json",
      type : "GET",
      success : function(response) {
        console.log(response);
      }
    });
  ```

**Update Appointment**
----
Update json data about a single appointment.

* **URL**

      api/appointments/:id

* **Method:**

  ` PUT`

*  **URL Params**

   **Required:**

   `id=[Long]`

* **Data Params**

  ```json
    {
      "firstName":"Pauline",
      "lastName":"Bordenave",
      "telephone":"0534546678",
      "email":"pauline@gmail.com",
      "comment":"je déteste tout ce qui n'a pas de couleur",
      "haircut": {"id":1},
      "timeSlot": {"id":3}
    }
  ```

* **Success Response:**

    * **Code:** 201 CREATED 
      **Content:**
      ```json
        {
          "firstName":"Pauline",
          "lastName":"Bordenave",
          "telephone":"0534546678",
          "email":"pauline@gmail.com",
          "comment":"je déteste tout ce qui n'a pas de couleur",
          "timeSlot": {
            "id": 3,
            "slotStart": "2022-12-24 23:00",
            "slotEnd": "2022-12-24 23:00"
          }
      }
      ```

* **Error Response:**

    * **Code:** 404 NOT FOUND  
      **Content:** `{ error : "Cet appointment n'existe pas" }`

* **Sample Call:**

  ```javascript
    fetch({
      url: "api/appointments/1",
      dataType: "json",
      type : "PUT",
      success : function(response) {
        console.log(response);
      }
    });
  ```

**Delete appointment**
----
Delete json data about a single appointment.

* **URL**

      api/appointments/:id

* **Method:**

  `DELETE`

*  **URL Params**

   **Required:**

   `id=[Long]`

* **Data Params**

  None

* **Success Response:**

    * **Code:** 200 OK  
      **Content:** `{ error : "L'appointment a été supprimé" }`

* **Error Response:**

    * **Code:** 404 NOT FOUND  
      **Content:** `{ error : "Ce appointment n'existe pas" }`


* **Sample Call:**

  ```javascript
    fetch({
      url: "api/appointments/1",
      dataType: "json",
      type : "DELETE",
      success : function(response) {
        console.log(response);
      }
    });
  ```

**Get all appointments**
----
Returns array json data.

* **URL**

      api/appointments

* **Method:**

  `GET`

*  **URL Params**

   **Required:**

   None
* **Data Params**

  None

* **Success Response:**

    * **Code:** 200 OK  
      **Content:**
      ```json
        [
          {
            "id":1,
            "firstName":"Pauline",
            "lastName":"Bordenave",
            "telephone":"0534546678",
            "email":"pauline@gmail.com",
            "comment":"je déteste tout ce qui n'a pas de couleur",
            "timeSlot": {"id":3}
          },
          { 
            "id":2,
            "firstName":"Coco",
            "lastName":"Mahi",
            "telephone":"0538546678",
            "email":"coco@gmail.com",
            "comment":"j'aime que le jaune",
            "timeSlot": {"id":2}
          }
        ]
      ```

* **Error Response:**

    * **Code:** 404 NOT FOUND  
      **Content:** `{ error : "Les appointments n'ont pas été trouvées" }`



* **Sample Call:**

  ```javascript
    fetch.ajax({
      url: "/appointments",
      dataType: "json",
      type : "GET",
      success : function(response) {
        console.log(response);
      }
    });
  ```

**Put appointment/haircut**
----
Update json data about appointment and haircut.

* **URL**

      api/appointments/{idAppointments}/haircut/{idHaircut}

* **Method:**

  `PUT`

*  **URL Params**

   **Required:**

   None
* **Data Params**

  None

* **Success Response:**

    * **Code:** 200 OK  

* **Error Response:**

    * **Code:** 404 NOT FOUND <br />
      **Content:** `{ error : "Les appointments n'ont pas été modifiés" }`



* **Sample Call:**

  ```javascript
    fetch.ajax({
      url: "/appointments/1/haircut/1",
      dataType: "json",
      type : "GET",
      success : function(response) {
        console.log(response);
      }
    });
  ```

**Put appointment/timeslot**
----
Update json data about appointment and timeslot.

* **URL**

      api/appointments/{idAppointments}/haircut/{idTimes}

* **Method:**

  `PUT`

*  **URL Params**

   **Required:**

   None
* **Data Params**

  None

* **Success Response:**

    * **Code:** 200 OK  

* **Error Response:**

    * **Code:** 404 NOT FOUND  
      **Content:** `{ error : "Les appointments n'ont pas été modifier" }`



* **Sample Call:**

  ```javascript
    fetch.ajax({
      url: "/appointments/1/times/1",
      dataType: "json",
      type : "GET",
      success : function(response) {
        console.log(response);
      }
    });
  ```
---


# User
**Add user**
----
Save a single user in the data base.

* **URL**

      api/user

* **Method:**

  `POST`

*  **URL Params**

   None

* **Data Params**

  ```json
    {
        "firstName":"Charle",
        "lastName" : "Martin",
        "password":"hoho",
        "email":"charlemartin4@outlook.com",
        "role":[{"idRole":1},{"idRole":3}]
    }
  ```

* **Success Response:**

    * **Code:** 201 OK  
      **Content:**
      ```json
        {
          "id":1,
          "firstName":"Charle",
          "lastName" : "Martin",
          "password":"hoho",
          "email":"charlemartin4@outlook.com",
          "role":[{"idRole":1},{"idRole":3}]
        }
      ```

* **Error Response:**

    * **Code:** 400 BAD REQUEST  
      **Content:** `{ error : "Requête invalide" }`


* **Sample Call:**

  ```javascript
    fetch({
      url: "api/user",
      dataType: "json",
      type : "POST",
      success : function(response) {
        console.log(response);
      }
    });
  ```

**Get user by id**
----
Returns json data about a single user.

* **URL**

      api/user/:id

* **Method:**

  `GET`

*  **URL Params**

   **Required:**

   `id=[Long]`

* **Data Params**

  None

* **Success Response:**

    * **Code:** 200 OK  
      **Content:**
      ```json
        {
          "id":1,
          "firstName":"Charle",
          "lastName" : "Martin",
          "password":"hoho",
          "email":"charlemartin4@outlook.com",
          "role":[{"idRole":1},{"idRole":3}]
        }
      ```

* **Error Response:**

    * **Code:** 404 NOT FOUND  
      **Content:** `{ error : "Cette user n'existe pas" }`



* **Sample Call:**

  ```javascript
    fetch({
      url: "/user/1",
      dataType: "json",
      type : "GET",
      success : function(response) {
        console.log(response);
      }
    });
  ```

**Update User**
----
Update json data about a single user.

* **URL**

      api/user/:id

* **Method:**

  ` PUT`

*  **URL Params**

   **Required:**

   `id=[Long]`

* **Data Params**

  ```json
    {
        "firstName":"Charle",
        "lastName" : "Martin",
        "password":"hoho",
        "email":"charlemartinquatre@outlook.com",
        "role":[{"idRole":1},{"idRole":3}]
    }
  ```

* **Success Response:**

    * **Code:** 201 CREATED  
      **Content:**
      ```json
        {
          "id":1,
          "firstName":"Charle",
          "lastName" : "Martin",
          "password":"hoho",
          "email":"charlemartinquatre@outlook.com",
          "role":[{"idRole":1},{"idRole":3}]
        }
      ```

* **Error Response:**

    * **Code:** 404 NOT FOUND   
      **Content:** `{ error : "Ce user n'existe pas" }`

* **Sample Call:**

  ```javascript
    fetch({
      url: "api/user/1",
      dataType: "json",
      type : "PUT",
      success : function(response) {
        console.log(response);
      }
    });
  ```


**Delete user**
----
Delete json data about a single user.

* **URL**

      api/user/:id

* **Method:**

  `DELETE`

*  **URL Params**

   **Required:**

   `id=[Long]`

* **Data Params**

  None

* **Success Response:**

    * **Code:** 200 OK
      **Content:** `{ error : "L'utilisateur a été supprimé" }`

* **Error Response:**

    * **Code:** 404 NOT FOUND   
      **Content:** `{ error : "Cet utilisateur n'existe pas" }`


* **Sample Call:**

  ```javascript
    fetch({
      url: "api/user/1",
      dataType: "json",
      type : "DELETE",
      success : function(response) {
        console.log(response);
      }
    });
  ```

**Get all user**
----
Returns array json data.

* **URL**

      api/user

* **Method:**

  `GET`

*  **URL Params**

   **Required:**

   None
* **Data Params**

  None

* **Success Response:**

    * **Code:** 200 OK  
      **Content:**
      ```json
        [
          {
            "id":1,
            "firstName":"Charle",
            "lastName" : "Martin",
            "password":"hoho",
            "email":"charlemartin4@outlook.com",
            "role":[{"idRole":1},{"idRole":3}]
          },
          {
            "id":2,
            "firstName":"Alice",
            "lastName" : "Hunter",
            "password":"2805",
            "email":"alice.hunter@aol.com",
            "role":[{"idRole":3}]
          }
        ]
      ```

* **Error Response:**

    * **Code:** 404 NOT FOUND  
      **Content:** `{ error : "Les ressources n'ont pas été trouvées" }`



* **Sample Call:**

  ```javascript
    fetch.ajax({
      url: "/user",
      dataType: "json",
      type : "GET",
      success : function(response) {
        console.log(response);
      }
    });
  ```

---


# Role
**Add role**
----
Save a single role in the data base.

* **URL**

      api/role

* **Method:**

  `POST`

*  **URL Params**

   None

* **Data Params**
    

```json
{
"name":"Admin"
}
```

* **Success Response:**

    * **Code:** 201 OK  
      **Content:**
      ```json
        {
          "id":1,
          "name":"Admin"
        }
      ```

* **Error Response:**

    * **Code:** 400 BAD REQUEST <br />
      **Content:** `{ error : "Requête invalide" }`


* **Sample Call:**

  ```javascript
    fetch({
      url: "api/role",
      dataType: "json",
      type : "POST",
      success : function(response) {
        console.log(response);
      }
    });
  ```

**Get role by id**
----
Returns json data about a single role.

* **URL**

      api/role/:id

* **Method:**

  `GET`

*  **URL Params**

   **Required:**

   `id=[Long]`

* **Data Params**

  None

* **Success Response:**

    * **Code:** 200 OK  
      **Content:**
      ```json
        {
          "id":1,
          "name":"Admin"
        }
      ```

* **Error Response:**

    * **Code:** 404 NOT FOUND   
      **Content:** `{ error : "Ce role n'existe pas" }`



* **Sample Call:**

  ```javascript
    fetch({
      url: "/role/1",
      dataType: "json",
      type : "GET",
      success : function(response) {
        console.log(response);
      }
    });
  ```

**Update Role**
----
Update json data about a single role.

* **URL**

      api/role/:id

* **Method:**

  ` PUT`

*  **URL Params**

   **Required:**

   `id=[Long]`

* **Data Params**

  ```json
    {
        "name":"Administrator"
    }
  ```

* **Success Response:**

    * **Code:** 201  CREATED
      **Content:**
      ```json
        {
          "id":1,
          "name":"Administrator"
        }
      ```

* **Error Response:**

    * **Code:** 404 NOT FOUND   
      **Content:** `{ error : "Ce role n'existe pas" }`

* **Sample Call:**

  ```javascript
    fetch({
      url: "api/role/1",
      dataType: "json",
      type : "PUT",
      success : function(response) {
        console.log(response);
      }
    });
  ```


**Delete role**
----
Delete json data about a single role.

* **URL**

      api/role/:id

* **Method:**

  `DELETE`

*  **URL Params**

   **Required:**

   `id=[Long]`

* **Data Params**

  None

* **Success Response:**

    * **Code:** 200 OK  
      **Content:** `{ error : "Le role a été supprimé" }`

* **Error Response:**

    * **Code:** 404 NOT FOUND  
      **Content:** `{ error : "Ce role n'existe pas" }`


* **Sample Call:**

  ```javascript
    fetch({
      url: "api/role/1",
      dataType: "json",
      type : "DELETE",
      success : function(response) {
        console.log(response);
      }
    });
  ```

**Get all roles**
----
Returns array json data.

* **URL**

      api/role

* **Method:**

  `GET`

*  **URL Params**

   **Required:**

   None
* **Data Params**

  None

* **Success Response:**

    * **Code:** 200 OK  
      **Content:**
      ```json
        [
          {
            "id":1,
            "name":"Admin"
          },
          {
            "id":2,
            "name":"Coiffeur"
          }
        ]
      ```

* **Error Response:**

    * **Code:** 404 NOT FOUND  
      **Content:** `{ error : "Les ressources n'ont pas été trouvées" }`



* **Sample Call:**

  ```javascript
    fetch.ajax({
      url: "/role",
      dataType: "json",
      type : "GET",
      success : function(response) {
        console.log(response);
      }
    });
  ```
