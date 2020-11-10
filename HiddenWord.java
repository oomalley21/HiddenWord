import java.lang.Math;

public class HiddenWord {
  private String answer;
  
  public HiddenWord(String hword)
  {
    answer = hword;
  }
  
  public HiddenWord(int len){
     String dict3 = "actaddadsageagoaidairallandanyapparearmartaskbadbagbarbaybedbigbitboxboybusbutbuycancapcarcatcupcutdaddaydiddiedogdrydueeateggenderaeyefanfarfatfeefewfitfixflyforfungapgasgetgodgotgunguygymhadhasherheyhimhishithothowiceitsjobjoykeykidkitlablawlayledlegletloglotlowmanmapmaymenmetmixmomnetnewnornotnowoffoiloldoneouroutownpayperpetpinpotproputranrawredridrowrunsadsatsawsayseaseesetsexshesitsixskysonsuntabtagtaxteatenthetiptootoptrytwouseviawarwaswaywebwetwhowhywinwonwowyesyetyou";
     String dict4 = "birdblowblueboatbodybombbondbonebookboombornbossbothbowlbulkburnbushbusycallcalmcamecampcardcarecasecashcastcellchatchipcityclubcoalcoatcodecoldcomecookcoolcopecopyCOREcostcrewcropdarkdatadatedawndaysdeaddealdeandeardebtdeepdenydeskdialdickdietdiscdiskdoesdonedoordosedowndrawdrewdropdrugdualdukedustdutyeachearneaseeasteasyedgeelseeveneverevilexitfacefactfailfairfallfarmfastfatefearfeedfeelfeetfellfeltfilefillfilmfindfinefirefirmfishfiveflatflowfoodfootfordformfortfourfreefromfuelfullfundgaingamegategavegeargenegiftgirlgivegladgoalgoesgoldGolfgonegoodgraygrewgreygrowgulfhairhalfhallhandhanghardharmhatehaveheadhearheatheldhellhelphereherohighhillhireholdholeholyhomehopehosthourhugehunghunthurtideainchintoironitemjackjanejeanjohnjoinjumpjuryjustkeenkeepkentkeptkickkillkindkingkneeknewknowlackladylaidlakelandlanelastlateleadleftlesslifeliftlikelinelinklistliveloadloanlocklogolonglooklordloselosslostloveluckmademailmainmakemalemanyMarkmassmattmealmeanmeatmeetmenumeremikemilemilkmillmindminemissmodemoodmoonmoremostmovemuchmustnamenavynearneckneednewsnextnicenickninenonenosenoteokayonceonlyontoopenoraloverpacepackpagepaidpainpairpalmparkpartpasspastpathpeakpickpinkpipeplanplayplotplugpluspollpoolpoorportpostpullpurepushracerailrainrankrareratereadrealrearrelyrentrestricerichrideringriseriskroadrockrolerollroofroomrootroserulerushruthsafesaidsakesalesaltsamesandsaveseatseedseekseemseenselfsellsendsentseptshipshopshotshowshutsicksidesignsitesizeskinslipslowsnowsoftsoilsoldsolesomesongsoonsortsoulspotstarstaystepstopsuchsuitsuretaketaletalktalltanktapetaskteamtechtelltendtermtesttextthanthatthemthentheythinthisthustilltimetinytoldtolltonetonytooktooltourtowntreetriptruetuneturntwintypeunituponuseduservaryvastveryviceviewvotewagewaitwakewalkwallwantwardwarmwashwavewaysweakwearweekwellwentwerewestwhatwhenwhomwidewifewildwillwindwinewingwirewisewishwithwoodwordworeworkyardyeahyearyourzerozone";
     String dict5 = "aboutaboveabuseaddedadultafteragainagentagreeaheadalbumaliveallowalonealongamongangleapartappleapplyareasarrayasideaskedassetaudioavoidawardawarebanksbasedbasicbasisbeachbeganbeginbeingbelowbiblebillsbirdsbirthblackbladeblockbloodboardbonusbooksboxesbrainbrandbreadbreakbriefbringbroadbrokebrownbuildbuiltbunchcablecallscardscarrycasescatchcausecellschainchairchartcheapcheckchestchiefchildchosecivilclaimclasscleanclearclickclosecloudclubscoachcoastcodescolorcomescostscouldcountcourtcovercraftcrazycreamcrimecrosscrowdcrowncycledailydancedatesdeathdepthdoingdoorsdoubtdraftdrawndreamdressdrinkdrivedrugsearlyeartheightemailemptyendedenemyenjoyenterentryequalerroreventeveryexactexistextrafactsfaithfeelsfewerfieldfifthfightfiledfilesfilmsfinalfindsfirmsfirstfixedfloorfluidfocusfolksfoodsforceformsforthforumfoundframefreshfrontfruitfullyfundsfunnygamesgiftsgirlsgivengivesglassgoalsgoinggoodsgradegrandgreatgreengroupgrownguardguessguestguidehandshappyheadsheardheartheavyhellohelpshenceholdsholeshomeshonorhorsehotelhourshousehumanidealideasimageindexinnerinputissueitemsjointjudgejuicekeepskindsknifeknownknowslabellaborlargelaterlayerleadslearnleastleavelegallevellightlikedlimitlineslinkslivedlivesloanslocallookslovedloveslowerluckylunchmagicmajormakesmatchmaybemealsmeansmeantmediameetsmetalmightmilesminormodelmoneymonthmotormountmousemouthmovedmoviemusicnamednamesneedsnevernewlynightnoisenorthnotednotesnurseoccuroceanofferoftenolderopensorderotherownedownerpagespaintpanelpaperparkspartspartypeacephasephonephotopiecepilotpitchplaceplaneplansplantplateplayspointpostspowerpresspriceprimeprintpriorprizeproofproudprovequeenquickquietquiteradioraiserangeratedratesratioreachreadyreferrightrisksriverroadsrolesroomsrootsroundrouteroyalrulesruralsalessaucesavedscalescenescopescoreseatsseedsseemssenseservesetupsevenshallshapesharesharpsheetshipsshoesshootshopsshortshotsshownshowssidessightsignssincesitessizesskillsleepsmallsmartsolarsolidsolvesongssorrysoundsouthspacespeakspeedspendspentspokesportspotsstaffstagestandstarsstartstatesteelstepsstickstillstockstonestoodstorestormstorystuckstudystuffstylesugarsupersweettabletakentakestaskstastetaxesteachteamsteethtellstermsteststhanktheirthemetherethesethickthingthinkthirdthosethreethrowtimestiredtitletodaytoolstopictotaltouchtoughtowertracktradetrailtraintreattreestrendtrialtriedtrucktrulytrumptrusttruthturnstwicetypesunderunionunitsuntilupperurbanusageusersusingusualvalidvaluevideoviewsvisitvitalvoicewallswantswastewatchwaterweeksweirdwheelwherewhichwhilewhitewholewhosewomanwomenwordsworksworldworryworseworstworthwouldwritewrongwroteyardsyearsyoungyoursyouth";
     String dict6 = "acceptaccessacrossactingactionactiveactualaddingadjustadultsadviceaffectaffordafraidagencyagentsagreedallowsalmostalwaysamountanimalannualansweranyoneanywayappealappeararoundarriveartistaskingaspectassetsassistassumeattackattendauthoravenueawardsbackupbattlebeautybecamebecomebeforebeginsbehindbeliefbetterbeyondbiggerblocksboardsbodiesborderbottlebottomboughtbranchbrandsbreastbridgebrightbringsbrokenbudgetbutterbuttonbuyersbuyingcalledcameracampuscancercarboncareercaughtcausedcausescentercentrechancechangechargecheesechoicechoosechosenchurchcirclecitiesclaimsclientclosedclosercoffeecolorscolourcolumncomingcommoncopiescornercountycouplecoursecourtscoverscreatecreditcrisiscustomdamagedebatedecadedecentdecidedefinedegreedeletedemanddesigndesiredetaildevicediningdinnerdirectdoctordollardomaindoubledreamsdrivendriverduringdutiesearnedeasiereasilyeatingeditoreffectefforteitheremailsenableenergyengageengineenoughensureentireequityerrorsestateeventsexceptexistsexpandexpectexpertextendextentfabricfacingfactorfailedfairlyfamilyfamousfasterfatherfellowfemalefieldsfigurefilledfilterfingerfinishflavorflightfolderfollowforcedforcesforestforgetformalformatformedformerfourthfrenchfriendfuturegainedgaragegardengendergermangivingglobalgoldengottengroundgroupsgrowthguestsguiltyguitarhandlehappenhavinghealthheavenheighthelpedhigherhighlyhonesthopinghotelshouseshumansimagesimpactinchesincomeindeedinjuryinsideinvestislandissuedissuesitselfjoinedjuniorkilledlaptoplargerlatestlatterlaunchlayerslayoutleaderleagueleaveslengthlessonletterlevelslightslikelylimitslinkedlistedlistenlittlelivinglongerlookedlosinglovelymainlymakingmanagemannermarinemarketmastermattermediummembermemorymentalmethodmiddleminutemissedmobilemodelsmodernmodulemomentmonthsmostlymothermotionmoviesmovingmurdermusclemuseummyselfnationnativenaturenearlyneedednightsnobodynormalnoticenumberobjectobtainoccursoffersofficeonlineopenedoptionordersoriginoutputownerspapersparentpassedpayingpeopleperiodpersonphonesphotospickedpiecesplacedplacesplanetplantsplayedplayerpleaseplentypocketpointspolicepolicypostedpoundspowderpowerspreferprettypricesprinceprisonprofitproperpublicpulledracingraisedrandomrarelyratherratingreaderreallyreasonrecentreciperecordreduceregionreliefremainremoteremoverentalrepairrepeatreportresortresultretailreturnreviewrightssafetysalarysamplesavingsayingscenesschemeschoolscoredscoresscreenscriptsearchseasonsecondsecretsectorsecureseeingseemedselectseniorsensorseriesservedserverservesseveresexualsharedsharesshouldshowedshowersignalsignedsilversimplesimplysinglesisterskillsslowlysmoothsocialsoundssourcespacesspeechspiritsportsspreadspringsquarestablestagesstandsstartsstatedstatesstatusstoredstoresstreamstreetstressstringstrongstudiostylessubmitsuffersummersupplysurelysurveyswitchsystemtablestakingtalenttalkedtargettaughttestedthankstheorythingsthinksthoughthreadthreattickettissuetitlestopicstowardtrackstraveltrendstryingturnedunableuniqueunitedunlessupdateusefulvalleyvaluesvictimvideosvisionvisualvolumewalkedwantedwealthweaponweeklyweightwheelswhilstwidelywindowwinnerwinterwithinwonderworkedworldswriteryellow";
     String dict = null;
     if(len==3) dict=dict3; 
     if(len==4) dict=dict4;
     if(len==5) dict=dict5;
     if(len==6) dict=dict6;
     int index = len*((int) (Math.random()*(dict.length()/len)));
     answer = dict.substring(index,index+len).toUpperCase();
    }
  
  public String getHint(String guess) 
  {
  String hint = "";
  for(int i=0; i<guess.length(); i++){
      
    if(answer.substring(i,i+1).equals(guess.substring(i,i+1)))
    {
      hint += guess.substring(i,i+1);
    } else if(answer.indexOf(guess.substring(i,i+1))>-1){
      hint+="+";
    } else hint+="*";
    
  }
  return hint;
  }
  
  public boolean gameOver(String finalGuess)
  {
      return answer.equals(finalGuess);
    }
  
}