class CloudClient
  TOKEN = "4e9f2ad551215ecc49fa0fdcb86254f1f9c261cf"
  
  def self.start
    CloudProvider.deploy(token: TOKEN)
  end
end
