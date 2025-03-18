select distinct rental.customer_id
from rental
where date(rental_date) = '2005-07-05'