(ns soda-ash.elements.image
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "image"
          :only-one? true}
         m))


(def groups
  [;; States
   (create-group
    {:group-name   "states"
     :group-vector (vector
                    :hidden
                    :disabled)})

   ;; Variations
   (create-group
    {:group-name   "avatar"
     :group-vector (vector
                    :avatar)})

   (create-group
    {:group-name   "bordered"
     :group-vector (vector
                    :bordered)})

   (create-group
    {:group-name   "fluid"
     :group-vector (vector
                    :fluid)})

   (create-group
    {:group-name   "rounded"
     :group-vector (vector
                    :rounded)})

   (create-group
    {:group-name   "circular"
     :group-vector (vector
                    :circular)})

   (create-group
    {:group-name   "aligned"
     :group-vector (vector
                    :top-aligned
                    :middle-aligned
                    :bottom-aligned)})

   (create-group
    {:group-name   "centered"
     :group-vector (vector
                    :centered)})

   (create-group
    {:group-name   "spaced"
     :group-vector (vector
                    :spaced)})

   (create-group
    {:group-name   "floated"
     :group-vector (vector
                    :left-floated
                    :right-floated)})

   (create-group
    {:group-name   "size"
     :group-vector (vector
                    :mini
                    :tiny
                    :small
                    :medium
                    :large
                    :big
                    :huge
                    :massive)})
   ])


(def opts
  {:tag     :img
   :ui?     true
   :ui-name "image"
   :groups  groups})


(defcomp "default" opts)
