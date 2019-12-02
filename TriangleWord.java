   private char letter;
   private int amount;
   
   PublicClass TriangleWord

	public TriangleWord()
	{


	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
		
	}

	public void setLetter(char c)
	{

		letter = c;
	}

	public void setAmount(int amt)
	{

		amount = amt;
	}

	public String toString()
	{
		String output="";
		for(int i=0;i<amount; i++)
		{
			char let=letter;
			for(int j=amount; j>i; j--)
		{
			for(int k=0; k<j; k++)
			{if(let>'Z')
			let='A';
			output+=let;
			}
			output+="";
			let++;
		}
		output+="\n";
		}
		return output;
		}
		}
