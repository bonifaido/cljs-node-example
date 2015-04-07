(defproject cljs_node "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://github.com/bonifaido/cljs-node-example"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-3169"]]

  :plugins [[lein-cljsbuild "1.0.5"]]

  :target-path "target/%s"

  :cljsbuild {
    :builds [
      {
        :id "dev"
        :source-paths ["src"]
        :compiler {
                   :output-to "target/dev/main.js"
                   :output-dir "target/dev"
                   :optimizations :none
                   :main "cljs_node.core"
                   :target :nodejs}}
      {
        :id "prod"
        :source-paths ["src"]
        :compiler {
                   :output-to "target/prod/main.js"
                   :output-dir "target/prod"
                   :optimizations :simple
                   :main "cljs_node.core"
                   :target :nodejs}}
    ]})
