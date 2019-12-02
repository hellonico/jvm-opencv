(defproject jvm-opencv/lein-template "0.0.30"
  :description "Created with lein-create-template"
  :deploy-repositories [["releases" :clojars]]
  :url "http://example.com/FIXME"
  :release-tasks [["vcs" "assert-committed"]
                ["change" "version" "leiningen.release/bump-version" "release"]
                ["vcs" "commit"]
                ["vcs" "tag" "--no-sign"]
                ["deploy" "clojars"]
                ["change" "version" "leiningen.release/bump-version"]
                ["vcs" "commit"]
                ["vcs" "push"]
                ]
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true)