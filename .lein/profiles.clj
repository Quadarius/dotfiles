{:user {:dependencies [[com.bhauman/rebel-readline "0.1.4"]]
        :aliases {"rebl" ["trampoline" "run" "-m" "rebel-readline.main"]}}
 :repl {:plugins [[cider/cider-nrepl "0.17.0"]]
        :dependencies [[org.clojure/tools.nrepl "0.2.13"]
                       [cider/piggieback "0.3.5"]
                       [figwheel-sidecar "0.5.16"]]
        :repl-options {:nrepl-middleware [cider.piggieback/wrap-cljs-repl]}}}
