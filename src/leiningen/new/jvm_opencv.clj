(ns leiningen.new.jvm-opencv
  (:use [leiningen.new.templates :only [renderer name-to-path sanitize-ns ->files]]))

(def render (renderer "jvm-opencv"))
(def raw (raw-resourcer "clj-opencv"))

(defn jvm-opencv
  [name]
  (let [data {:name name
              :ns-name (sanitize-ns name)
              :sanitized (name-to-path name)}]
    (->files data 
    	; ["src/{{sanitized}}/core.clj" (render "src/leinin/core.clj" data)]
		; ["test/{{sanitized}}/core_test.clj" (render "test/leinin/core_test.clj" data)]
["project.clj" (render "project.clj" data)]
["java_sample.ipynb" (render "java_sample.ipynb" data)]
; ["gradlew" (render "gradlew")]
; ["gradlew.bat" (render "gradlew.bat")]
["build.gradle" (render "build.gradle" data)]
["pom.xml" (render "pom.xml" data)]
; ["gradle/wrapper/gradle-wrapper.properties" (render "gradle-wrapper.properties")]
["settings.gradle" (render "settings.gradle" data)]
["java/HelloCv.java" (render "java/HelloCv.java")]
["marcel.jpg" (raw "marcel.jpg")]
)))