(ns example.core	
	(:use	compojure.core
			ring.util.response
			ring.adapter.jetty
			example.routes)
	(:require	[compojure.handler :as handler]
				[compojure.response :as response]))
(def app
	(handler/site main-routes))

(defn -main [& args]
	(let [port (Integer/parseInt (get (System/getenv) "PORT" "8080"))]
    (run-jetty app {:port port})))
