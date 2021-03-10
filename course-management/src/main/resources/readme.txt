J2EE Architecture:
-------------------
1. Client makes a request it goes to the Presentation layer, which is nothing but our Controllers. Controller can be considered as the first point of contact for request.
      	
2. Now the controller, depending on the request goes to the Service layer where the business logic is written.

3. Now if the activity involves interacting with the database, then service layer accesses the db via the help of a DAO/Repository layer.

4. After that, the controller takes the response and gives it to the client.

(*) Matlab agr ek restaurant m gye, toh jb hum as customer order krenge toh wo waiter lega , toh yha waiter controller h. 
(*) Ab depending on humlogon ne kya order kia h, waiter usi according wo particular dish ke chef ke paas jaega.
(*) Chef dish bnakr dega, toh wo actual service provide kr rha h, toh wo act krega as a service layer.
(*) Now suppose chef ko atta kam pad gya toh wo godown se mangwaega, toh wo apna helper ko boldia laane toh chef ka helper is DAO and godown h database.
(*) Jb bn jaega dish toh witer yani controller client ko response yani dish serve krdega.

------------------------------------------------- End of Explanation -------------------------------------------------------

API - Application Programming Interface (Bharosa B Bana Rhe aur Kaam b hota Rhe)
----

Amazon aur Indigo ka communication FLight Tickets k lia
########################################################
3rd party websites can to-fro communication with the airlines company using API.
Amazon instead of communicating with the Airlines db directly it does it via API.
Indigo is able to verify whether it is Amazonor some hacker on the basis of an API Key which is unique to Amazon only.

Note: Not all APIs need an API key, some expose the data on the public endpoint available to all.

API is used to expose only certain information and not all the information. For e.g., Indigo will only expose data related to tickets and seats and not their employees' data.

Wrna agar Indigo API k jgh sbko apna db ka userName and password de dega toh koi agr uska system khraab krdia toh bada loss ho jaega.

Payment Gateway
################
Humlog ko toh bank ka transaction handling code likhna possible nhi...toh humlog apne app m SBI ya PayTm ka API call krlenge aur transaction poora krlege :) 

----------------------------------------------------- End of Explanation -----------------------------------------------------------------

