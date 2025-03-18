select distinct rental.customer_id, rental_date
from rental
where date(rental_date) = '2005-07-05'