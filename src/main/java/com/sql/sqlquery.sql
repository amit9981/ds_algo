SELECT DISTINCT City
FROM Station
WHERE UPPER(LEFT(CITY, 1)) IN ('A', 'E', 'I', 'O', 'U') AND LOWER(RIGHT(CITY,1))IN ('a','e','i','o','u');
/*Query a list of CITY names from STATION for cities that have an even ID number. Print the results in any order, but exclude duplicates from the answer.*/
select distinct CITY from STATION where ID%2 = 0
