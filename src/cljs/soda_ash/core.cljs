(ns soda-ash.core
  (:require-macros
   [soda-ash.macros :refer [defc]])
  (:require
   [soda-ash.helpers :as h]
   [soda-ash.elements.button :as button]
   [soda-ash.elements.container :as container]
   [soda-ash.elements.divider :as divider]
   [soda-ash.elements.flag :as flag]
   [soda-ash.elements.header :as header]
   [soda-ash.elements.icon :as icon]
   [soda-ash.elements.image :as image]
   [soda-ash.elements.input :as input]
   [soda-ash.elements.label :as label]
   [soda-ash.elements.loader :as loader]
   [soda-ash.elements.rail :as rail]
   [soda-ash.elements.reveal :as reveal]
   [soda-ash.elements.segment :as segment]
   [soda-ash.elements.s-list :as s-list]
   ))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; ELEMENTS

;; button

(defc "button" nil)
(defc "button" "primary")
(defc "button" "secondary")
(defc "button" "animated")
(defc "button" "vertical-animated")
(defc "button" "animated-fade")
(defc "button" "labeled")
(defc "button" "left-labeled")
(defc "button" "icon")
(defc "button" "labeled-icon")
(defc "button" "right-labeled-icon")
(defc "button" "basic")
(defc "button" "inverted")
(defc "button" "inverted-basic")


;; container

(defc "container" nil)
(defc "container" "text")


;; divider

(defc "divider" nil)
(defc "divider" "vertical")
(defc "divider" "horizontal")
(defc "divider" "horizontal-header")


;; flag

(defc "flag" "ae")
(defc "flag" "af")
(defc "flag" "ag")
(defc "flag" "ai")
(defc "flag" "al")
(defc "flag" "am")
(defc "flag" "an")
(defc "flag" "ao")
(defc "flag" "ar")
(defc "flag" "as")
(defc "flag" "at")
(defc "flag" "au")
(defc "flag" "aw")
(defc "flag" "ax")
(defc "flag" "az")
(defc "flag" "ba")
(defc "flag" "bb")
(defc "flag" "bd")
(defc "flag" "be")
(defc "flag" "bf")
(defc "flag" "bg")
(defc "flag" "bh")
(defc "flag" "bi")
(defc "flag" "bj")
(defc "flag" "bm")
(defc "flag" "bn")
(defc "flag" "bo")
(defc "flag" "br")
(defc "flag" "bs")
(defc "flag" "bt")
(defc "flag" "bv")
(defc "flag" "bw")
(defc "flag" "by")
(defc "flag" "bz")
(defc "flag" "ca")
(defc "flag" "cc")
(defc "flag" "cd")
(defc "flag" "cf")
(defc "flag" "cg")
(defc "flag" "ch")
(defc "flag" "ci")
(defc "flag" "ck")
(defc "flag" "cl")
(defc "flag" "cm")
(defc "flag" "cn")
(defc "flag" "co")
(defc "flag" "cr")
(defc "flag" "cs")
(defc "flag" "cu")
(defc "flag" "cv")
(defc "flag" "cx")
(defc "flag" "cy")
(defc "flag" "cz")
(defc "flag" "de")
(defc "flag" "dj")
(defc "flag" "dk")
(defc "flag" "dm")
(defc "flag" "do")
(defc "flag" "dz")
(defc "flag" "ec")
(defc "flag" "ee")
(defc "flag" "eg")
(defc "flag" "eh")
(defc "flag" "er")
(defc "flag" "es")
(defc "flag" "et")
(defc "flag" "eu")
(defc "flag" "fi")
(defc "flag" "fj")
(defc "flag" "fk")
(defc "flag" "fm")
(defc "flag" "fo")
(defc "flag" "fr")
(defc "flag" "ga")
(defc "flag" "gb")
(defc "flag" "gd")
(defc "flag" "ge")
(defc "flag" "gf")
(defc "flag" "gh")
(defc "flag" "gi")
(defc "flag" "gl")
(defc "flag" "gm")
(defc "flag" "gn")
(defc "flag" "gp")
(defc "flag" "gq")
(defc "flag" "gr")
(defc "flag" "gs")
(defc "flag" "gt")
(defc "flag" "gu")
(defc "flag" "gw")
(defc "flag" "gy")
(defc "flag" "hk")
(defc "flag" "hm")
(defc "flag" "hn")
(defc "flag" "hr")
(defc "flag" "ht")
(defc "flag" "hu")
(defc "flag" "id")
(defc "flag" "ie")
(defc "flag" "il")
(defc "flag" "in")
(defc "flag" "io")
(defc "flag" "iq")
(defc "flag" "ir")
(defc "flag" "is")
(defc "flag" "it")
(defc "flag" "jm")
(defc "flag" "jo")
(defc "flag" "jp")
(defc "flag" "ke")
(defc "flag" "kg")
(defc "flag" "kh")
(defc "flag" "ki")
(defc "flag" "km")
(defc "flag" "kn")
(defc "flag" "kp")
(defc "flag" "kr")
(defc "flag" "kw")
(defc "flag" "ky")
(defc "flag" "kz")
(defc "flag" "la")
(defc "flag" "lb")
(defc "flag" "lc")
(defc "flag" "li")
(defc "flag" "lk")
(defc "flag" "lr")
(defc "flag" "ls")
(defc "flag" "lt")
(defc "flag" "lu")
(defc "flag" "lv")
(defc "flag" "ly")
(defc "flag" "ma")
(defc "flag" "mc")
(defc "flag" "md")
(defc "flag" "me")
(defc "flag" "mg")
(defc "flag" "mh")
(defc "flag" "mk")
(defc "flag" "ml")
(defc "flag" "mm")
(defc "flag" "mn")
(defc "flag" "mo")
(defc "flag" "mp")
(defc "flag" "mq")
(defc "flag" "mr")
(defc "flag" "ms")
(defc "flag" "mt")
(defc "flag" "mu")
(defc "flag" "mv")
(defc "flag" "mw")
(defc "flag" "mx")
(defc "flag" "my")
(defc "flag" "mz")
(defc "flag" "na")
(defc "flag" "nc")
(defc "flag" "ne")
(defc "flag" "nf")
(defc "flag" "ng")
(defc "flag" "ni")
(defc "flag" "nl")
(defc "flag" "no")
(defc "flag" "np")
(defc "flag" "nr")
(defc "flag" "nu")
(defc "flag" "nz")
(defc "flag" "om")
(defc "flag" "pa")
(defc "flag" "pe")
(defc "flag" "pf")
(defc "flag" "pg")
(defc "flag" "ph")
(defc "flag" "pk")
(defc "flag" "pl")
(defc "flag" "pm")
(defc "flag" "pn")
(defc "flag" "pr")
(defc "flag" "ps")
(defc "flag" "pt")
(defc "flag" "pw")
(defc "flag" "py")
(defc "flag" "qa")
(defc "flag" "re")
(defc "flag" "ro")
(defc "flag" "rs")
(defc "flag" "ru")
(defc "flag" "rw")
(defc "flag" "sa")
(defc "flag" "sb")
(defc "flag" "sc")
(defc "flag" "sd")
(defc "flag" "se")
(defc "flag" "sg")
(defc "flag" "sh")
(defc "flag" "si")
(defc "flag" "sj")
(defc "flag" "sk")
(defc "flag" "sl")
(defc "flag" "sm")
(defc "flag" "sn")
(defc "flag" "so")
(defc "flag" "sr")
(defc "flag" "st")
(defc "flag" "sv")
(defc "flag" "sy")
(defc "flag" "sz")
(defc "flag" "tc")
(defc "flag" "td")
(defc "flag" "tf")
(defc "flag" "tg")
(defc "flag" "th")
(defc "flag" "tj")
(defc "flag" "tk")
(defc "flag" "tl")
(defc "flag" "tm")
(defc "flag" "tn")
(defc "flag" "to")
(defc "flag" "tr")
(defc "flag" "tt")
(defc "flag" "tv")
(defc "flag" "tw")
(defc "flag" "tz")
(defc "flag" "ua")
(defc "flag" "ug")
(defc "flag" "um")
(defc "flag" "us")
(defc "flag" "uy")
(defc "flag" "uz")
(defc "flag" "va")
(defc "flag" "vc")
(defc "flag" "ve")
(defc "flag" "vg")
(defc "flag" "vi")
(defc "flag" "vn")
(defc "flag" "vu")
(defc "flag" "wf")
(defc "flag" "ws")
(defc "flag" "ye")
(defc "flag" "yt")
(defc "flag" "za")
(defc "flag" "zm")


;; header

(defc "header" "h1")
(defc "header" "h2")
(defc "header" "h3")
(defc "header" "h4")
(defc "header" "h5")
(defc "header" "huge")
(defc "header" "large")
(defc "header" "medium")
(defc "header" "small")
(defc "header" "tiny")
;; header-icon is implemented using :ash
(defc "header" "sub")


;; icon

(defc "icon" "alarm")
(defc "icon" "alarm-slash")
(defc "icon" "alarm-outline")
(defc "icon" "alarm-slash-outline")
(defc "icon" "at")
(defc "icon" "browser")
(defc "icon" "bug")
(defc "icon" "calendar-outline")
(defc "icon" "calendar")
(defc "icon" "cloud")
(defc "icon" "comment")
(defc "icon" "comments")
(defc "icon" "comment-outline")
(defc "icon" "comments-outline")
(defc "icon" "copyright")
(defc "icon" "dashboard")
(defc "icon" "dropdown")
(defc "icon" "external-square")
(defc "icon" "external")
(defc "icon" "eyedropper")
(defc "icon" "feed")
(defc "icon" "find")
(defc "icon" "heartbeat")
(defc "icon" "history")
(defc "icon" "home")
(defc "icon" "idea")
(defc "icon" "inbox")
(defc "icon" "lab")
(defc "icon" "mail")
(defc "icon" "mail-outline")
(defc "icon" "mail-square")
(defc "icon" "map")
(defc "icon" "options")
(defc "icon" "paint-brush")
(defc "icon" "payment")
(defc "icon" "phone")
(defc "icon" "phone-square")
(defc "icon" "privacy")
(defc "icon" "protect")
(defc "icon" "search")
(defc "icon" "setting")
(defc "icon" "settings")
(defc "icon" "shop")
(defc "icon" "sidebar")
(defc "icon" "signal")
(defc "icon" "sitemap")
(defc "icon" "tag")
(defc "icon" "tags")
(defc "icon" "tasks")
(defc "icon" "terminal")
(defc "icon" "text-telephone")
(defc "icon" "ticket")
(defc "icon" "trophy")
(defc "icon" "wifi")

(defc "icon" "adjust")
(defc "icon" "add-user")
(defc "icon" "add-to-cart")
(defc "icon" "archive")
(defc "icon" "ban")
(defc "icon" "bookmark")
(defc "icon" "call")
(defc "icon" "call-square")
(defc "icon" "cloud-download")
(defc "icon" "cloud-upload")
(defc "icon" "compress")
(defc "icon" "configure")
(defc "icon" "download")
(defc "icon" "edit")
(defc "icon" "erase")
(defc "icon" "exchange")
(defc "icon" "external-share")
(defc "icon" "expand")
(defc "icon" "filter")
(defc "icon" "flag")
(defc "icon" "flag-outline")
(defc "icon" "forward-mail")
(defc "icon" "hide")
(defc "icon" "in-cart")
(defc "icon" "lock")
(defc "icon" "pin")
(defc "icon" "print")
(defc "icon" "random")
(defc "icon" "recycle")
(defc "icon" "refresh")
(defc "icon" "remove-bookmark")
(defc "icon" "remove-user")
(defc "icon" "repeat")
(defc "icon" "reply-all")
(defc "icon" "reply")
(defc "icon" "retweet")
(defc "icon" "send")
(defc "icon" "send-outline")
(defc "icon" "share-alternate")
(defc "icon" "share-alternate-square")
(defc "icon" "share")
(defc "icon" "share-square")
(defc "icon" "sign-in")
(defc "icon" "sign-out")
(defc "icon" "theme")
(defc "icon" "translate")
(defc "icon" "undo")
(defc "icon" "unhide")
(defc "icon" "unlock-alternate")
(defc "icon" "unlock")
(defc "icon" "upload")
(defc "icon" "wait")
(defc "icon" "wizard")
(defc "icon" "write")
(defc "icon" "write-square")

(defc "icon" "announcement")
(defc "icon" "birthday")
(defc "icon" "help")
(defc "icon" "help-circle")
(defc "icon" "info")
(defc "icon" "info-circle")
(defc "icon" "warning")
(defc "icon" "warning-circle")
(defc "icon" "warning-sign")

(defc "icon" "child")
(defc "icon" "doctor")
(defc "icon" "handicap")
(defc "icon" "spy")
(defc "icon" "student")
(defc "icon" "user")
(defc "icon" "users")

(defc "icon" "female")
(defc "icon" "gay")
(defc "icon" "heterosexual")
(defc "icon" "intergender")
(defc "icon" "lesbian")
(defc "icon" "male")
(defc "icon" "man")
(defc "icon" "neuter")
(defc "icon" "non-binary-transgender")
(defc "icon" "transgender")
(defc "icon" "other-gender")
(defc "icon" "other-gender-horizontal")
(defc "icon" "other-gender-vertical")
(defc "icon" "woman")

(defc "icon" "grid-layout")
(defc "icon" "list-layout")
(defc "icon" "block-layout")
(defc "icon" "zoom")
(defc "icon" "zoom-out")
(defc "icon" "resize-vertical")
(defc "icon" "resize-horizontal")
(defc "icon" "maximize")
(defc "icon" "crop")

(defc "icon" "anchor")
(defc "icon" "bar")
(defc "icon" "bomb")
(defc "icon" "book")
(defc "icon" "bullseye")
(defc "icon" "calculator")
(defc "icon" "checkered-flag")
(defc "icon" "cocktail")
(defc "icon" "diamond")
(defc "icon" "fax")
(defc "icon" "fire-extinguisher")
(defc "icon" "fire")
(defc "icon" "gift")
(defc "icon" "leaf")
(defc "icon" "legal")
(defc "icon" "lemon")
(defc "icon" "life-ring")
(defc "icon" "lightning")
(defc "icon" "magnet")
(defc "icon" "money")
(defc "icon" "moon")
(defc "icon" "plane")
(defc "icon" "puzzle")
(defc "icon" "rain")
(defc "icon" "road")
(defc "icon" "rocket")
(defc "icon" "shipping")
(defc "icon" "soccer")
(defc "icon" "suitcase")
(defc "icon" "sun")
(defc "icon" "travel")
(defc "icon" "treatment")
(defc "icon" "world")

(defc "icon" "asterisk")
(defc "icon" "certificate")
(defc "icon" "circle")
(defc "icon" "circle-notched")
(defc "icon" "circle-thin")
(defc "icon" "crosshairs")
(defc "icon" "cube")
(defc "icon" "cubes")
(defc "icon" "ellipsis-horizontal")
(defc "icon" "ellipsis-vertical")
(defc "icon" "quote-left")
(defc "icon" "quote-right")
(defc "icon" "spinner")
(defc "icon" "square")
(defc "icon" "square-outline")

(defc "icon" "add-circle")
(defc "icon" "add-square")
(defc "icon" "check-circle")
(defc "icon" "check-circle-outline")
(defc "icon" "check-square")
(defc "icon" "checkmark-box")
(defc "icon" "checkmark")
(defc "icon" "minus-circle")
(defc "icon" "minus")
(defc "icon" "minus-square")
(defc "icon" "minus-square-outline")
(defc "icon" "move")
(defc "icon" "plus")
(defc "icon" "plus-square-outline")
(defc "icon" "radio")
(defc "icon" "remove-circle")
(defc "icon" "remove-circle-outline")
(defc "icon" "remove")
(defc "icon" "selected-radio")
(defc "icon" "toggle-off")
(defc "icon" "toggle-on")

(defc "icon" "area-chart")
(defc "icon" "bar-chart")
(defc "icon" "camera-retro")
(defc "icon" "newspaper")
(defc "icon" "film")
(defc "icon" "line-chart")
(defc "icon" "photo")
(defc "icon" "pie-chart")
(defc "icon" "sound")

(defc "icon" "angle-double-down")
(defc "icon" "angle-double-left")
(defc "icon" "angle-double-right")
(defc "icon" "angle-double-up")
(defc "icon" "angle-down")
(defc "icon" "angle-left")
(defc "icon" "angle-right")
(defc "icon" "angle-up")
(defc "icon" "arrow-circle-down")
(defc "icon" "arrow-circle-left")
(defc "icon" "arrow-circle-outline-down")
(defc "icon" "arrow-circle-outline-left")
(defc "icon" "arrow-circle-outline-right")
(defc "icon" "arrow-circle-outline-up")
(defc "icon" "arrow-circle-right")
(defc "icon" "arrow-circle-up")
(defc "icon" "arrow-down")
(defc "icon" "arrow-left")
(defc "icon" "arrow-right")
(defc "icon" "arrow-up")
(defc "icon" "caret-down")
(defc "icon" "caret-left")
(defc "icon" "caret-right")
(defc "icon" "caret-up")
(defc "icon" "chevron-circle-down")
(defc "icon" "chevron-circle-left")
(defc "icon" "chevron-circle-right")
(defc "icon" "chevron-circle-up")
(defc "icon" "chevron-down")
(defc "icon" "chevron-left")
(defc "icon" "chevron-right")
(defc "icon" "chevron-up")
(defc "icon" "long-arrow-down")
(defc "icon" "long-arrow-left")
(defc "icon" "long-arrow-right")
(defc "icon" "long-arrow-up")
(defc "icon" "pointing-down")
(defc "icon" "pointing-left")
(defc "icon" "pointing-right")
(defc "icon" "pointing-up")
(defc "icon" "toggle-down")
(defc "icon" "toggle-left")
(defc "icon" "toggle-right")
(defc "icon" "toggle-up")

(defc "icon" "desktop")
(defc "icon" "disk-outline")
(defc "icon" "file-archive-outline")
(defc "icon" "file-audio-outline")
(defc "icon" "file-code-outline")
(defc "icon" "file-excel-outline")
(defc "icon" "file")
(defc "icon" "file-image-outline")
(defc "icon" "file-outline")
(defc "icon" "file-pdf-outline")
(defc "icon" "file-powerpoint-outline")
(defc "icon" "file-text")
(defc "icon" "file-text-outline")
(defc "icon" "file-video-outline")
(defc "icon" "file-word-outline")
(defc "icon" "folder")
(defc "icon" "folder-open")
(defc "icon" "folder-open-outline")
(defc "icon" "folder-outline")
(defc "icon" "game")
(defc "icon" "keyboard")
(defc "icon" "laptop")
(defc "icon" "level-down")
(defc "icon" "level-up")
(defc "icon" "mobile")
(defc "icon" "power")
(defc "icon" "plug")
(defc "icon" "tablet")
(defc "icon" "trash")
(defc "icon" "trash-outline")

(defc "icon" "barcode")
(defc "icon" "css3")
(defc "icon" "database")
(defc "icon" "fork")
(defc "icon" "html5")
(defc "icon" "openid")
(defc "icon" "qrcode")
(defc "icon" "rss")
(defc "icon" "rss-square")
(defc "icon" "server")

(defc "icon" "empty-heart")
(defc "icon" "empty-star")
(defc "icon" "frown")
(defc "icon" "heart")
(defc "icon" "meh")
(defc "icon" "smile")
(defc "icon" "star-half-empty")
(defc "icon" "star-half")
(defc "icon" "star")
(defc "icon" "thumbs-down")
(defc "icon" "thumbs-outline-down")
(defc "icon" "thumbs-outline-up")
(defc "icon" "thumbs-up")

(defc "icon" "backward")
(defc "icon" "eject")
(defc "icon" "fast-backward")
(defc "icon" "fast-forward")
(defc "icon" "forward")
(defc "icon" "music")
(defc "icon" "mute")
(defc "icon" "pause")
(defc "icon" "play")
(defc "icon" "record")
(defc "icon" "step-backward")
(defc "icon" "step-forward")
(defc "icon" "stop")
(defc "icon" "unmute")
(defc "icon" "video-play")
(defc "icon" "video-play-outline")
(defc "icon" "volume-down")
(defc "icon" "volume-off")
(defc "icon" "volume-up")

(defc "icon" "building")
(defc "icon" "building-outline")
(defc "icon" "car")
(defc "icon" "coffee")
(defc "icon" "emergency")
(defc "icon" "first-aid")
(defc "icon" "food")
(defc "icon" "h")
(defc "icon" "hospital")
(defc "icon" "location-arrow")
(defc "icon" "marker")
(defc "icon" "military")
(defc "icon" "paw")
(defc "icon" "space-shuttle")
(defc "icon" "spoon")
(defc "icon" "taxi")
(defc "icon" "tree")
(defc "icon" "university")

(defc "icon" "columns")
(defc "icon" "sort-alphabet-ascending")
(defc "icon" "sort-alphabet-descending")
(defc "icon" "sort-ascending")
(defc "icon" "sort-content-ascending")
(defc "icon" "sort-content-descending")
(defc "icon" "sort-descending")
(defc "icon" "sort")
(defc "icon" "sort-numeric-ascending")
(defc "icon" "sort-numeric-descending")
(defc "icon" "table")

(defc "icon" "align-center")
(defc "icon" "align-justify")
(defc "icon" "align-left")
(defc "icon" "align-right")
(defc "icon" "attach")
(defc "icon" "bold")
(defc "icon" "copy")
(defc "icon" "cut")
(defc "icon" "font")
(defc "icon" "header")
(defc "icon" "indent")
(defc "icon" "italic")
(defc "icon" "linkify")
(defc "icon" "list")
(defc "icon" "ordered-list")
(defc "icon" "outdent")
(defc "icon" "paragraph")
(defc "icon" "paste")
(defc "icon" "save")
(defc "icon" "strikethrough")
(defc "icon" "subscript")
(defc "icon" "superscript")
(defc "icon" "text-height")
(defc "icon" "text-width")
(defc "icon" "underline")
(defc "icon" "unlink")
(defc "icon" "unordered-list")

(defc "icon" "dollar")
(defc "icon" "euro")
(defc "icon" "lira")
(defc "icon" "pound")
(defc "icon" "ruble")
(defc "icon" "rupee")
(defc "icon" "won")
(defc "icon" "shekel")
(defc "icon" "yen")

(defc "icon" "american-express")
(defc "icon" "discover")
(defc "icon" "google-wallet")
(defc "icon" "mastercard")
(defc "icon" "paypal-card")
(defc "icon" "paypal")
(defc "icon" "stripe")
(defc "icon" "visa")

(defc "icon" "adn")
(defc "icon" "android")
(defc "icon" "angellist")
(defc "icon" "apple")
(defc "icon" "behance")
(defc "icon" "behance-square")
(defc "icon" "bitbucket")
(defc "icon" "bitbucket-square")
(defc "icon" "bitcoin")
(defc "icon" "buysellads")
(defc "icon" "codepen")
(defc "icon" "connectdevelop")
(defc "icon" "dashcube")
(defc "icon" "delicious")
(defc "icon" "deviantart")
(defc "icon" "digg")
(defc "icon" "dribbble")
(defc "icon" "dropbox")
(defc "icon" "drupal")
(defc "icon" "empire")
(defc "icon" "facebook")
(defc "icon" "facebook-square")
(defc "icon" "flickr")
(defc "icon" "forumbee")
(defc "icon" "foursquare")
(defc "icon" "git")
(defc "icon" "git-square")
(defc "icon" "github-alternate")
(defc "icon" "github")
(defc "icon" "github-square")
(defc "icon" "gittip")
(defc "icon" "google")
(defc "icon" "google-plus")
(defc "icon" "google-plus-square")
(defc "icon" "hacker-news")
(defc "icon" "instagram")
(defc "icon" "ioxhost")
(defc "icon" "joomla")
(defc "icon" "jsfiddle")
(defc "icon" "lastfm")
(defc "icon" "lastfm-square")
(defc "icon" "leanpub")
(defc "icon" "linkedin")
(defc "icon" "linkedin-square")
(defc "icon" "linux")
(defc "icon" "maxcdn")
(defc "icon" "meanpath")
(defc "icon" "medium")
(defc "icon" "pagelines")
(defc "icon" "pied-piper-alternate")
(defc "icon" "pied-piper")
(defc "icon" "pinterest")
(defc "icon" "pinterest-square")
(defc "icon" "qq")
(defc "icon" "rebel")
(defc "icon" "reddit")
(defc "icon" "reddit-square")
(defc "icon" "renren")
(defc "icon" "sellsy")
(defc "icon" "shirtsinbulk")
(defc "icon" "simplybuilt")
(defc "icon" "skyatlas")
(defc "icon" "skype")
(defc "icon" "slack")
(defc "icon" "slideshare")
(defc "icon" "soundcloud")
(defc "icon" "spotify")
(defc "icon" "stack-exchange")
(defc "icon" "stack-overflow")
(defc "icon" "steam")
(defc "icon" "steam-square")
(defc "icon" "stumbleupon-circle")
(defc "icon" "stumbleupon")
(defc "icon" "tencent-weibo")
(defc "icon" "trello")
(defc "icon" "tumblr")
(defc "icon" "tumblr-square")
(defc "icon" "twitch")
(defc "icon" "twitter")
(defc "icon" "twitter-square")
(defc "icon" "viacoin")
(defc "icon" "vimeo")
(defc "icon" "vine")
(defc "icon" "vk")
(defc "icon" "wechat")
(defc "icon" "weibo")
(defc "icon" "whatsapp")
(defc "icon" "windows")
(defc "icon" "wordpress")
(defc "icon" "xing")
(defc "icon" "xing-square")
(defc "icon" "yahoo")
(defc "icon" "yelp")
(defc "icon" "youtube")
(defc "icon" "youtube-play")
(defc "icon" "youtube-square")


;; image

(defc "image" nil)


;; input

(defc "input" nil)


;; label

(defc "label" nil)
(defc "label" "image")
(defc "label" "pointing")
(defc "label" "pointing-below")
(defc "label" "left-pointing")
(defc "label" "right-pointing")
(defc "label" "left-corner")
(defc "label" "right-corner")
(defc "label" "tag")
(defc "label" "ribbon")
(defc "label" "right-ribbon")
(defc "label" "top-attached")
(defc "label" "bottom-attached")
(defc "label" "top-right-attached")
(defc "label" "top-left-attached")
(defc "label" "bottom-right-attached")
(defc "label" "bottom-left-attached")
(defc "label" "horizontal")
(defc "label" "floating")


;; loader

(defc "loader" nil)
(defc "loader" "text")


;; rail

(defc "rail" "left")
(defc "rail" "right")
(defc "rail" "left-internal")
(defc "rail" "right-internal")
(defc "rail" "left-dividing")
(defc "rail" "right-dividing")


;; reveal

(defc "reveal" "fade")
(defc "reveal" "move")
(defc "reveal" "move-up")
(defc "reveal" "move-right")
(defc "reveal" "move-down")
(defc "reveal" "rotate")
(defc "reveal" "rotate-left")


;; segment

(defc "segment" nil)
(defc "segment" "raised")
(defc "segment" "stacked")
(defc "segment" "tall-stacked")
(defc "segment" "piled")
(defc "segment" "vertical")


;; s-list

(defc "s-list" nil)
(defc "s-list" "bulleted")
(defc "s-list" "ordered")
(defc "s-list" "custom")
(defc "s-list" "link")
(defc "s-list" "bulleted-link")
