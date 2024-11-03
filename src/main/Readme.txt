->Pourquoi HashMap pour stocker les informations produit ?
	HashMap permet un accès rapide aux produits par leur ID, ce qui est efficace pour une recherche rapide par clé. 
	Contrairement à une ArrayList ou un tableau, elle permet une recherche en temps constantO(1).. 
	Pour notre application où l’ID est unique, HashMap est efficace et appropriée pour gérer l'inventaire des produits.

->Pourquoi utiliser une ArrayList pour les expéditions quotidiennes ?
	La ArrayList conserve l'ordre d'insertion, 
	ce qui nous permet de stocker les ID des produits reçus dans l'ordre d'arrivée. 
	Cela répond à la demande du responsable pour consulter les expéditions dans leur ordre d'arrivée.

->Que faire si les produits doivent être triés par nom et ID ?
	nous pourrions créer une liste triée par les deux critères en combinant un Comparator par nom et ID.

->Que faire si les IDs ne sont pas uniques ou si les expéditions nécessitent des horodatages ?
	Si les IDs ne sont pas uniques, on pourrait utiliser une liste (List<Product>) pour permettre des doublons. 
	Pour les horodatages, on pourrait créer une Map (Map<LocalDateTime, Integer>) avec un LocalDateTime associé aux ID de produit,