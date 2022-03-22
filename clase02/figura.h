class figura{
	public: 
		figura(int lados, int tamano_lados);
		~figura();

		int lados;
		int tamano_lados;

		int calcular_area();
	private:
		void metodo_privado();
};