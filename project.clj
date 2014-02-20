(defproject Asthma-Analysis "0.1.1-SNAPSHOT"
  :description "Comparing national weather data with Asthma medication prescriptions historically and then forecasting future prescriptions"
  :url "https://github.com/QMUL-Group-Project/Asthma-Analysis"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.logging "0.2.6"]
                 [cascalog "1.10.1"]
                 [org.clojure/math.numeric-tower "0.0.2"]
                 [cascalog-math "0.1.0"]
                 [clojure-csv/clojure-csv "2.0.0-alpha1"]
                 [clj-time "0.5.1"]]
  :profiles {:dev {:dependencies [[midje "1.5.1"
                                   :exclusions [org.apache.httpcomponents/httpcore
                                                commons-io]]
                                  [org.apache.hadoop/hadoop-core "1.0.4"
                                   :exclusions [org.slf4j/slf4j-api
                                                commons-logging
                                                commons-codec
                                                org.slf4j/slf4j-log4j12
                                                log4j]]]}
             :provided {:dependencies [[org.apache.hadoop/hadoop-core "0.20.2-dev"]]}}
  :aot [Asthma-Analysis]
  :main Asthma-Analysis
  :uberjar-name "Asthma-Analysis.jar"
  :exclusions [org.apache.hadoop/hadoop-core
               org.clojure/clojure
               midje])
