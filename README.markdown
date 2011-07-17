
A very (very) simple example of Clojure + Compojure project that can run on Heroku's Cedar stack.

Get Requests to **/** will serve up  <h3>Hello World</h3> And gets to **/:name** will return a _{"name" : <:name arg here> }_ json object.

**Note:**  defroutes (GET "/" [] ... was causing me no end of problems; it worked fine, locally, on my box but not on Heroku. 
Using GET "/*" fixes this but catches all request, So currently I'm just relying on route/not-found to resolve "/" requests...


**The Procfile is the key to getting it running on Heroku:**
	>_web: lein run -m example.core_

This is an instruction for a "web" process that tells heroku to run the -main method in core.server

### Usage:
> Sign up with Heroku,
 
> Follow instruction's here: http://devcenter.heroku.com/articles/quickstart
BUT create a new app on the cedar stack with: 
	 >>**heroku create --stack cedar**

>instead of just "heroku create".

> Then _git push heroku master_
