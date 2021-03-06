(defproject domofon-mock-server "0.1.0-SNAPSHOT"
  :description "Mock server that supports domofon-tck"
  :url "https://github.com/blstream/domofon-mock-server"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [cheshire "5.6.1"]
                 [compojure "1.4.0"]
                 [ring-middleware-format "0.7.0"]
                 [ring/ring-defaults "0.1.5"]
                 [medley "0.7.4"]
                 [clj-time "0.11.0"]
                 [aleph "0.4.1-beta5"]]
  :main domofon-mock-server.server)
