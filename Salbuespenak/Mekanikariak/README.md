## Salbuespenak, interfazeak eta herentzia

### MekanikariaException.java
* Gure salbuespen bat sortuko dugu (extends Exception).
* ErroreLaburra, erroreGaratua eta erroreData (java.util.Date erakoa) izango ditu ezaugarri moduan.

### IMekanikaria.java
* Interfaze bat sortuko dugu IMekanikaria izenekoa. Ondorengo metodoak izango ditu:
    - void autoaKonpondu();
    - int kobratu();
    - void biharEtorri();

### HodeiMekanikaria.java
* Klase bat sortuko dugu "IMekanikaria" interfazea inplementatuko duena.
* AutoaKonpondu() metodoan salbuespen bat botako du. Salbuespenean errore laburrak, errore garatua eta gertakizunaren data agertuko dira.

### Main.java
* Metodo nagusia izango duen klasea sortuko dugu.
* HodeiMekanikaria instantzia bat erabiliko dugu eta autoa konpontzeko eskatuko diogu.


