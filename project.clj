(defproject example "1.0.0-SNAPSHOT"
  :description "Example of a Clojure + Compojure app that will run on Heroku"
  	:dev-dependencies [	[lein-ring "0.4.3"]]
	:dependencies [	[ring "0.3.8"]
					[compojure "0.6.3"]
					[hiccup "0.3.4"]
					[clj-json "0.3.2"]
					[ring/ring-jetty-adapter "0.3.8"]]
	:ring {:handler example.core/app})