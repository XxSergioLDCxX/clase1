<?php
class Gato extends Animal {
    public function comer() {
        echo "{$this->nombre} está comiendo.\n";
    }

    public function dormir() {
        echo "{$this->nombre} está durmiendo.\n";
    }

    public function hacerRuido() {
        echo "{$this->nombre} maulla.\n";
    }

    public function hacerCaso() {
        // 5% de las veces hace caso
        return rand(1, 100) <= 5;
    }

    public function toserBolaPelo() {
        echo "{$this->nombre} ha tosido una bola de pelo.\n";
    }
}