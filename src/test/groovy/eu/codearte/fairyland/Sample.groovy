package eu.codearte.fairyland

import static eu.codearte.fairyland.Hook.anyPerson
import static eu.codearte.fairyland.Hook.create

println "\n * With context"
3.times {
    def person = create().person()

    println "${person.fullName()} <${person.email()}>"

}

// Print words
println create().text().words(3)
println create().text().sentence(5)
