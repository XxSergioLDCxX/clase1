<?php
class CuraBizantino {
    public function convertirAldeano(Aldeano $aldeano) {
        if ($aldeano->getCivilizacion()->getNombre() !== "Bizantinos") {
            echo "{$aldeano->getNombre()} ha sido convertido por un cura bizantino y se une a los Bizantinos.\n";
            $aldeano->getCivilizacion()->almacenarOro(-1); // Restar aldeano convertido
            $aldeano->getCivilizacion()->almacenarOro(1); // Añadir aldeano a los Bizantinos
        }
    }
}