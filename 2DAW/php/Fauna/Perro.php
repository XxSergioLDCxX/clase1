<?php
class Perro extends Animal {
    public function sacarPaseo() {
        echo "{$this->nombre} está dando un paseo.\n";
    }

    public function hacerRuido() {
        echo "{$this->nombre} ladra.\n";
    }

    public function hacerCaso() {
        // 90% de las veces hace caso
        return rand(1, 10) <= 9;
    }
}