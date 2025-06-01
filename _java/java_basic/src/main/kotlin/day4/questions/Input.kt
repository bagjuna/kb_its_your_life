package day4.questions

import java.util.*

class Input {

    companion object {
        private val scanner = Scanner(System.`in`)

        fun read(title: String): String {
            print(title + " : ")

            val input = scanner.nextLine()
            return input
        }

        fun read(title: String, defaultValue: String): String {
            print(title)
            val input = scanner.nextLine()
            if (input.isEmpty()) {
                return defaultValue
            }
            return input
        }

        fun readInt(title: String): Int {
            print(title)
            val input = scanner.nextLine()
            return input.toInt()
        }

        fun confirm(title: String, defaultValue: Boolean): Boolean {
            print(title)
            val input = scanner.nextLine()
            /// defaultValue가 true이면 (Y/n), false이면 (y/N)을 출력
            val yes = if (defaultValue) "Y/n" else "y/N"
            println(yes)
            return when (input) {
                "Y", "y" -> true
                "N", "n" -> false
                else -> defaultValue
            }
        }


    }


}