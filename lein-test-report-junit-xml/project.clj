(defproject lein-test-report-junit-xml "0.2.0"
  :description "Leiningen plugin providing JUnit XML output for clojure.test"
  :url "https://github.com/redbadger/test-report-junit-xml"
  :scm {:dir ".."}
  :license {:name "Eclipse Public License", :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[lein-test-report "0.2.0"]]
  :aliases {"deploy" ["deploy" "clojars"]}
  :eval-in-leiningen true)
