public class ProjectFinal extends TeamLead implements TeamAsst {
    public static void main(String[] args) {
        
        TeamLead tl = new TeamLead();
        tl.project();
        tl.on_time();
        tl.team_members();

        
    }
    @Override
      public void project()
      {
        System.out.println("upcoming project");
      }
      @Override

      public void on_time()
      {
        System.out.println("to be submitted by march 10");
      }
      @Override

      public void team_members()
      {
        System.out.println("team consists of 6 members");
      }


    
}
