(ns example.routes
	(:use	compojure.core
			tools.json
			hiccup.core)
	(:require	[compojure.route :as route]))

(defroutes main-routes
	(GET "/:id" [id] (json-response {:name id}))
	(route/not-found (html [:h3 "Hello World"])))