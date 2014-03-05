(defproject Asthma-Analysis "0.1.1-SNAPSHOT"
  :description "Comparing national weather data with Asthma medication prescriptions historically and then forecasting future prescriptions"
  :url "https://github.com/QMUL-Group-Project/Asthma-Analysis"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.logging "0.2.6"]
                 [cascalog "2.0.0"]
                 [org.clojure/math.numeric-tower "0.0.2"]
                 [cascalog-math "0.1.0"]
                 [clojure-csv/clojure-csv "2.0.0-alpha1"]
                 [clj-time "0.5.1"]]

:main ^:skip-aot asthma.core
:target-path "target/%s"
:profiles {:uberjar {:aot :all}})
:profiles {:dev {:dependencies [[org.apache.hadoop/hadoop-core "1.1.2"]]}}
:jvm-opts ["-Xms768m" "-Xmx768m"]
