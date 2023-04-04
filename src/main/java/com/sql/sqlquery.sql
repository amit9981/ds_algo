SELECT DISTINCT City
FROM Station
WHERE UPPER(LEFT(CITY, 1)) IN ('A', 'E', 'I', 'O', 'U') AND LOWER(RIGHT(CITY,1))IN ('a','e','i','o','u');
