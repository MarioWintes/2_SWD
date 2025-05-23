package baustelle;

  class Baustelle {
        private final MaschinenFabrik fabrik;

        public Baustelle(MaschinenFabrik fabrik) {
            this.fabrik = fabrik;
        }

        public void arbeite() {
            fabrik.maschineBedienen();
        }
    }
