package com.example.demo

class PreguntasRepository {
    companion object {
        var listaPreguntas = mutableListOf(
            Preguntas("En que año empezo el covid","2019","2020","2021","2005","A"),
            Preguntas("Cuantos dias tiene un año","360","366","365","355","C"),
            Preguntas("Cual es la capital de Francia","Praga","Tallin","Paris","Madrid","C"),
            Preguntas("Cuantos continentes hay","3","5","8","7","D"),
            Preguntas("Cual es el mes que menos dias tiene","Marzo","Febrero","Julio","Diciembre","B"),
            Preguntas("Cual es la capital de Ecuador","Lima","El cairo","Ambato","Quito","D"),
            Preguntas("En que año fue la revolucion francesa","1769","1789","1987","1979","B")
        )
    }
}