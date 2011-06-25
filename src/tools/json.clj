(ns tools.json
	(:require	[clj-json.core :as json]))
	
(defn json-response [data & [status]]
	{	:status (or status 200)
		:headers {"Content-Type" "application/json"}
		:body (json/generate-string data)})