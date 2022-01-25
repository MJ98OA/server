package com.example.demo

import org.springframework.web.bind.annotation.*
import kotlin.random.Random

@RestController
class PreguntasController {


     lateinit var pregunta:Preguntas

    @GetMapping("getPreguntaRandom")
    fun getPreguntaRandom() : Preguntas {
        pregunta=PreguntasRepository.listaPreguntas.get(Random.nextInt(PreguntasRepository.listaPreguntas.size))
        return pregunta

    }

    @GetMapping("getPreguntaRandom/{id}")
    fun getPokemonFavorito(@PathVariable id: String) : String {



        return if (id == pregunta.solucion)
            "cierto"+pregunta.toString()
        else
            "Falso"+pregunta.toString()

    }


}