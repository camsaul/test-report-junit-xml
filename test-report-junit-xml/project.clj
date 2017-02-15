(defproject test-report-junit-xml "0.2.0"
  :description "Library providing JUnit XML output for clojure.test"
  :url "https://github.com/redbadger/test-report-junit-xml"
  :scm {:dir ".."}
  :license {:name "Eclipse Public License", :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-shade "0.3.0"]]
  :profiles {:test {:resource-paths ["test/resources"]}
             :uberjar {:aot :all}
             :provided {:dependencies [[org.clojure/clojure "1.8.0"]]}
             :shaded {:dependencies [[org.clojure/data.xml "0.2.0-alpha2" :exclusions [org.clojure/clojure]]]
                      :shade {:namespaces [clojure.data.xml]}}
             :unshaded ^:leaky {:dependencies [[test-report "0.2.0"]]}
             :default [:leiningen/default :shaded :unshaded]}
  :aliases {"deploy" ["deploy-shaded-jar" "clojars"]
            "install" ["install-shaded-jar"]})
