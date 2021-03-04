fun joinOptions(options: Collection<String>): String =
        options.joinToString(
                separator = ", ",
                prefix = "[",
                postfix = "]"
        )
