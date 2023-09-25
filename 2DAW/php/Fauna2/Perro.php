<?php
class Perro extends Animal {
    public function comer() {
        echo "{$this->nombre} está comiendo.\n";
    }

    public function dormir() {
        echo "{$this->nombre} está durmiendo.\n";
    }

    public function hacerRuido() {
        echo "{$this->nombre} ladra.\n";
    }

    public function hacerCaso() {
        // 90% de las veces hace caso
        return rand(1, 10) <= 9;
    }

    public function sacarPaseo() {
        echo "{$this->nombre} está dando un paseo.\n";
    }
}