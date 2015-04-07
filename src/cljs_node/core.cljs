(ns cljs_node.core)

(enable-console-print!)

(defn http-server []
    ; TODO this require can go without 'js/' with some require stmt, check nodejs.cljs
    (let [http (js/require "http")
          handler (fn [req res] (.end res "Hello World!"))
          server (.createServer http handler)]
        (.listen server 1337)))

(defn -main []
    (http-server)
    (println "Server running at http://127.0.0.1:1337/"))

(set! *main-cli-fn* -main)