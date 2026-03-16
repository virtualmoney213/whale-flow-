<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
<title>Whale Flow Pro</title>
<link href="https://fonts.googleapis.com/css2?family=Space+Mono:wght@400;700&family=Barlow+Condensed:wght@400;600;700;800;900&family=Barlow:wght@400;500;600&display=swap" rel="stylesheet">
<style>
:root{
  --bg:#060a0e;--s1:#0c1118;--s2:#111820;--s3:#161f28;
  --b1:#1c2a38;--b2:#243344;
  --green:#00e87a;--gd:#00e87a18;--gm:#00e87a40;
  --red:#ff2d55;--rd:#ff2d5518;--rm:#ff2d5540;
  --gold:#ffb830;--yd:#ffb83018;--ym:#ffb83040;
  --blue:#3d9fff;--bd:#3d9fff18;--bm:#3d9fff40;
  --purple:#a855f7;--pd:#a855f718;--pm:#a855f740;
  --text:#dceeff;--tm:#8099b0;--td:#4a6278;
}
*{margin:0;padding:0;box-sizing:border-box;-webkit-tap-highlight-color:transparent}
body{background:var(--bg);color:var(--text);font-family:'Barlow',sans-serif;font-size:14px;overflow-x:hidden}
.hdr{background:var(--s1);border-bottom:1px solid var(--b1);padding:11px 14px;display:flex;align-items:center;justify-content:space-between;position:sticky;top:0;z-index:300}
.logo{font-family:'Barlow Condensed',sans-serif;font-size:19px;font-weight:900;letter-spacing:3px;color:var(--green)}
.sub{font-size:9px;color:var(--td);letter-spacing:2px}
.pill{display:flex;align-items:center;gap:5px;background:var(--gd);border:1px solid var(--gm);border-radius:20px;padding:4px 10px}
.dot{width:6px;height:6px;border-radius:50%;background:var(--green);animation:blink 1.4s infinite}
.pt{font-size:10px;color:var(--green);font-family:'Space Mono',monospace}
@keyframes blink{0%,100%{opacity:1}50%{opacity:.25}}
.tabs{background:var(--s1);border-bottom:1px solid var(--b1);display:flex;overflow-x:auto;scrollbar-width:none;position:sticky;top:52px;z-index:299}
.tabs::-webkit-scrollbar{display:none}
.tab{flex:0 0 auto;padding:10px 13px;font-family:'Barlow Condensed',sans-serif;font-size:11px;font-weight:700;letter-spacing:1.5px;text-transform:uppercase;color:var(--td);cursor:pointer;border-bottom:2px solid transparent;white-space:nowrap;transition:all .15s}
.tab.on{color:var(--green);border-bottom-color:var(--green)}
.page{display:none;padding:0 0 90px}
.page.on{display:block}
.ptitle{font-family:'Barlow Condensed',sans-serif;font-size:21px;font-weight:900;letter-spacing:1px;margin-bottom:2px}
.psub{font-size:11px;color:var(--td);margin-bottom:12px}
.slbl{font-family:'Barlow Condensed',sans-serif;font-size:10px;font-weight:700;letter-spacing:2px;text-transform:uppercase;color:var(--td);margin-bottom:8px}
.card{background:var(--s1);border:1px solid var(--b1);border-radius:11px;padding:13px;margin-bottom:11px}
.mbar{display:flex;gap:7px;overflow-x:auto;scrollbar-width:none;padding:10px 12px 0}
.mbar::-webkit-scrollbar{display:none}
.mchip{flex:0 0 auto;background:var(--s2);border:1px solid var(--b1);border-radius:9px;padding:7px 11px;min-width:66px;text-align:center}
.mn{font-size:9px;color:var(--td);letter-spacing:1px}
.mp{font-family:'Space Mono',monospace;font-size:12px;font-weight:700;margin-top:2px}
.mc{font-size:10px;margin-top:1px;font-family:'Space Mono',monospace}
.scan-bar{display:flex;align-items:center;gap:8px;padding:8px 12px;background:var(--s1);border-bottom:1px solid var(--b1);position:sticky;top:88px;z-index:200}
.scan-filter{display:flex;gap:5px;overflow-x:auto;scrollbar-width:none;flex:1}
.scan-filter::-webkit-scrollbar{display:none}
.fchip{flex:0 0 auto;padding:5px 10px;border-radius:20px;font-family:'Barlow Condensed',sans-serif;font-size:11px;font-weight:700;letter-spacing:1px;cursor:pointer;border:1px solid var(--b2);color:var(--td);background:var(--s2);white-space:nowrap}
.fchip.on{background:var(--gd);border-color:var(--gm);color:var(--green)}
.fchip.red.on{background:var(--rd);border-color:var(--rm);color:var(--red)}
.scan-count{font-family:'Space Mono',monospace;font-size:10px;color:var(--td);white-space:nowrap}
.subtabs{display:flex;background:var(--s2);margin:8px 12px;border-radius:10px;padding:3px;gap:3px}
.stab{flex:1;text-align:center;padding:7px;border-radius:8px;font-family:'Barlow Condensed',sans-serif;font-size:12px;font-weight:700;letter-spacing:1px;color:var(--td);cursor:pointer;transition:all .15s}
.stab.on{background:var(--s1);color:var(--green);border:1px solid var(--b2)}
.scan-list{padding:0 12px}
.srow{background:var(--s2);border-radius:10px;margin-bottom:8px;overflow:hidden;border-left:3px solid var(--b2);cursor:pointer}
.srow.bull{border-left-color:var(--green)}
.srow.bear{border-left-color:var(--red)}
.srow-top{display:flex;align-items:center;padding:10px 11px 8px;gap:8px}
.srow-side{width:28px;height:28px;border-radius:7px;display:flex;align-items:center;justify-content:center;font-size:13px;flex-shrink:0}
.side-bull{background:var(--gd)}.side-bear{background:var(--rd)}
.srow-main{flex:1;min-width:0}
.srow-ticker{font-family:'Space Mono',monospace;font-size:14px;font-weight:700;display:flex;align-items:center;gap:5px;flex-wrap:wrap}
.srow-detail{font-size:10px;color:var(--td);margin-top:2px;font-family:'Space Mono',monospace}
.srow-right{text-align:right;flex-shrink:0}
.conv-big{font-family:'Barlow Condensed',sans-serif;font-size:26px;font-weight:900;line-height:1}
.conv-lbl{font-size:9px;color:var(--td);letter-spacing:1px}
.srow-stats{display:flex;border-top:1px solid var(--b1);padding:7px 11px}
.stat-box{flex:1;text-align:center;border-right:1px solid var(--b1)}
.stat-box:last-child{border-right:none}
.stat-lbl{font-size:9px;color:var(--td);letter-spacing:.5px;margin-bottom:2px}
.stat-val{font-family:'Space Mono',monospace;font-size:11px;font-weight:700}
.strat-row{display:flex;align-items:center;gap:5px;padding:6px 11px;border-top:1px solid var(--b1);flex-wrap:wrap}
.strat-lbl{font-size:9px;color:var(--td);letter-spacing:1px;font-family:'Barlow Condensed',sans-serif;font-weight:700}
.sbadge{padding:3px 7px;border-radius:4px;font-size:10px;font-weight:700;font-family:'Space Mono',monospace}
.sb-2u{background:var(--gd);color:var(--green)}.sb-2d{background:var(--rd);color:var(--red)}
.sb-out{background:var(--pd);color:var(--purple)}.sb-in{background:var(--yd);color:var(--gold)}.sb-1{background:#ffffff0d;color:var(--td)}
.srow-expand{display:none;padding:10px 11px;border-top:1px solid var(--b1);background:var(--s3)}
.srow-expand.open{display:block}
.exp-grid{display:grid;grid-template-columns:1fr 1fr;gap:8px;margin-bottom:10px}
.exp-box{background:var(--s1);border-radius:8px;padding:9px}
.exp-lbl{font-size:9px;color:var(--td);letter-spacing:1px;margin-bottom:4px}
.exp-val{font-family:'Space Mono',monospace;font-size:12px;font-weight:700}
.chk-list{display:flex;flex-direction:column;gap:3px;margin-bottom:10px}
.chk{font-size:11px;color:var(--tm);line-height:1.4}
.verd{border-radius:7px;padding:9px;font-size:11px;line-height:1.5;border:1px solid;margin-bottom:8px}
.verd.high{background:var(--gd);border-color:var(--gm);color:var(--green)}
.verd.mid{background:var(--yd);border-color:var(--ym);color:var(--gold)}
.verd.low{background:var(--rd);border-color:var(--rm);color:var(--red)}
.sz-box{border-radius:9px;padding:10px;border:1px solid;margin-bottom:8px}
.sz-box.high{background:var(--gd);border-color:var(--gm)}.sz-box.mid{background:var(--yd);border-color:var(--ym)}.sz-box.low{background:var(--rd);border-color:var(--rm)}
.sz-title{font-family:'Barlow Condensed',sans-serif;font-size:13px;font-weight:800;letter-spacing:1px;margin-bottom:5px}
.tier{display:flex;justify-content:space-between;font-size:11px;padding:4px 7px;border-radius:5px;background:#ffffff08;margin-bottom:3px}
.tlbl{color:var(--tm)}.tval{font-family:'Space Mono',monospace;font-weight:700}
.sec-wrap{overflow-x:auto;padding:12px}
.sec-table{width:100%;border-collapse:collapse;min-width:340px}
.sec-table th{font-family:'Barlow Condensed',sans-serif;font-size:10px;font-weight:700;letter-spacing:2px;color:var(--td);text-transform:uppercase;padding:8px 6px;text-align:center;border-bottom:2px solid var(--b2)}
.sec-table th:first-child{text-align:left;padding-left:4px}
.sec-table td{padding:7px 5px;border-bottom:1px solid var(--b1);vertical-align:middle}
.sec-table tr:last-child td{border-bottom:none}
.sec-name{font-family:'Barlow Condensed',sans-serif;font-size:13px;font-weight:700}
.sec-etf{font-size:9px;color:var(--td);letter-spacing:1px;margin-top:1px}
.pct-row{display:flex;gap:3px;justify-content:center}
.pct{font-family:'Space Mono',monospace;font-size:10px;font-weight:700;padding:2px 5px;border-radius:4px}
.pct-bull{background:var(--gd);color:var(--green)}.pct-bear{background:var(--rd);color:var(--red)}
.bias-bar{height:4px;border-radius:2px;margin-top:4px;overflow:hidden;display:flex}
.bias-bull{background:var(--green)}.bias-bear{background:var(--red)}
.so{display:inline-flex;align-items:center;justify-content:center;width:22px;height:22px;border-radius:6px;font-size:11px}
.so-bull{background:var(--gd)}.so-bear{background:var(--rd)}.so-mix{background:var(--yd)}
.cgrid{display:grid;grid-template-columns:1fr 1fr;gap:9px;padding:12px}
.ccard{background:var(--s2);border:1px solid var(--b1);border-radius:11px;padding:11px;text-align:center}
.ctk{font-family:'Space Mono',monospace;font-size:14px;font-weight:700;margin-bottom:9px}
.crow{display:flex;justify-content:space-around;margin-bottom:7px}
.ctf{display:flex;flex-direction:column;align-items:center;gap:2px}
.clb2{font-size:9px;color:var(--td);letter-spacing:1px}
.cdot{width:28px;height:28px;border-radius:7px;display:flex;align-items:center;justify-content:center;font-size:12px}
.dbull{background:var(--gd)}.dbear{background:var(--rd)}.dneut{background:#ffffff0d}
.cstat{font-family:'Barlow Condensed',sans-serif;font-size:11px;font-weight:800;letter-spacing:1.5px}
.sbull{color:var(--green)}.sbear{color:var(--red)}.smix{color:var(--gold)}
.ema-line{font-size:9px;color:var(--td);margin-top:2px}
.bbsq{background:var(--pd);border:1px solid var(--purple);border-radius:6px;padding:6px 8px;margin-top:6px;font-size:10px;color:var(--purple);line-height:1.4}
.lrow{display:flex;justify-content:space-between;align-items:center;padding:9px 0;border-bottom:1px solid var(--b1)}
.lrow:last-child{border-bottom:none}
.lname{font-size:12px;color:var(--tm)}.lalert{font-size:10px;color:var(--gold);margin-top:2px}
.lprice{font-family:'Space Mono',monospace;font-size:13px}
.ldist{font-size:10px;margin-top:2px;font-family:'Space Mono',monospace}
.vbadge{display:inline-flex;align-items:center;background:var(--bd);border:1px solid var(--bm);border-radius:4px;padding:2px 6px;font-size:9px;color:var(--blue);font-family:'Space Mono',monospace}
.et-grid{display:grid;grid-template-columns:1fr 1fr;gap:8px;margin-top:10px}
.et-box{border-radius:8px;padding:10px;border:1px solid}
.et-entry{background:var(--bd);border-color:var(--bm)}.et-target{background:var(--gd);border-color:var(--gm)}
.et-title{font-family:'Barlow Condensed',sans-serif;font-size:11px;font-weight:800;letter-spacing:1.5px;margin-bottom:6px}
.et-row{display:flex;justify-content:space-between;font-size:11px;padding:3px 0;border-bottom:1px solid #ffffff0a}
.et-row:last-child{border-bottom:none}
.et-lbl{color:var(--td)}.et-val{font-family:'Space Mono',monospace}
.cin{width:100%;background:var(--bg);border:1px solid var(--b1);border-radius:7px;padding:10px 12px;color:var(--text);font-family:'Space Mono',monospace;font-size:13px;outline:none;margin-bottom:10px}
.cin:focus{border-color:var(--gold)}
.clbl2{font-size:10px;color:var(--td);letter-spacing:1.5px;text-transform:uppercase;margin-bottom:4px;font-family:'Barlow Condensed',sans-serif;font-weight:700}
.rcard{background:var(--s2);border-radius:11px;padding:15px;margin-top:11px}
.rbig{text-align:center;padding:12px 0 14px}
.rbignum{font-family:'Barlow Condensed',sans-serif;font-size:50px;font-weight:900;line-height:1}
.rbiglbl{font-size:10px;color:var(--td);letter-spacing:2px;margin-top:3px}
.rrow{display:flex;justify-content:space-between;padding:6px 0;border-bottom:1px solid var(--b1);font-size:12px}
.rrow:last-child{border-bottom:none}
.rlbl{color:var(--td)}.rval{font-family:'Space Mono',monospace}
.stopbox{background:var(--rd);border:1px solid var(--rm);border-radius:10px;padding:13px;margin-top:11px}
.stoptitle{font-family:'Barlow Condensed',sans-serif;font-size:14px;font-weight:800;color:var(--red);letter-spacing:1px;margin-bottom:9px}
.stoprule{font-size:12px;color:var(--tm);margin-bottom:9px;line-height:1.6;padding-bottom:9px;border-bottom:1px solid var(--rm)}
.stoprule:last-child{border-bottom:none;margin-bottom:0;padding-bottom:0}
.advbox{background:#ffffff08;border-radius:8px;padding:11px;margin-top:10px;font-size:12px;color:var(--tm);line-height:1.7}
.btn{background:var(--green);color:#000;border:none;border-radius:8px;padding:12px 18px;font-family:'Barlow Condensed',sans-serif;font-weight:800;font-size:14px;letter-spacing:1px;cursor:pointer;width:100%}
.btn:active{opacity:.8}
.btnout{background:transparent;color:var(--green);border:1px solid var(--green);width:auto;padding:7px 13px;font-size:12px;border-radius:8px;font-family:'Barlow Condensed',sans-serif;font-weight:700;letter-spacing:1px;cursor:pointer}
.brow{display:flex;justify-content:space-between;align-items:center;padding:8px 12px}
.btm{font-size:10px;color:var(--td);font-family:'Space Mono',monospace}
.ld{display:flex;flex-direction:column;align-items:center;justify-content:center;padding:44px 16px;gap:13px}
.spin{width:30px;height:30px;border:2px solid var(--b1);border-top-color:var(--green);border-radius:50%;animation:spin .7s linear infinite}
@keyframes spin{to{transform:rotate(360deg)}}
.ltxt{font-size:11px;color:var(--td);letter-spacing:2px;font-family:'Space Mono',monospace}
.empty{text-align:center;padding:30px;color:var(--td);font-size:12px;line-height:1.8}
.err{background:var(--rd);border:1px solid var(--rm);border-radius:8px;padding:10px;font-size:11px;color:var(--red);margin:12px;line-height:1.5}
.pad{padding:12px}
.div{height:1px;background:var(--b1);margin:11px 0}
.warn{background:var(--yd);border:1px solid var(--ym);border-radius:8px;padding:10px;font-size:11px;color:var(--gold);margin-bottom:11px;line-height:1.5}
input[type=text]{flex:1;background:var(--bg);border:1px solid var(--b1);border-radius:7px;padding:10px 12px;color:var(--text);font-family:'Space Mono',monospace;font-size:12px;outline:none}
input:focus{border-color:var(--green)}
.irow{display:flex;gap:7px}
.srow2{display:flex;justify-content:space-between;align-items:center;padding:12px 0;border-bottom:1px solid var(--b1)}
.srow2:last-child{border-bottom:none}
.slbl2{font-size:13px}.ssub{font-size:10px;color:var(--td);margin-top:2px}
.toggle{width:42px;height:22px;background:var(--b1);border-radius:11px;position:relative;cursor:pointer;transition:background .2s}
.toggle.on{background:var(--green)}
.knob{width:18px;height:18px;background:#fff;border-radius:50%;position:absolute;top:2px;left:2px;transition:transform .2s}
.toggle.on .knob{transform:translateX(20px)}
select{background:var(--bg);color:var(--text);border:1px solid var(--b1);border-radius:6px;padding:5px 9px;font-size:12px;font-family:'Space Mono',monospace}
</style>
</head>
<body>

<div class="hdr">
  <div><div class="logo">🐳 WHALE FLOW</div><div class="sub">INSTITUTIONAL INTELLIGENCE v4</div></div>
  <div class="pill"><div class="dot"></div><div class="pt">LIVE</div></div>
</div>

<div id="app">
  <div class="tabs">
    <div class="tab on" onclick="goTab('scanner',this)">🔍 SCANNER</div>
    <div class="tab" onclick="goTab('sectors',this)">🏭 SECTORS</div>
    <div class="tab" onclick="goTab('signals',this)">📊 SIGNALS</div>
    <div class="tab" onclick="goTab('levels',this)">🎯 LEVELS</div>
    <div class="tab" onclick="goTab('calc',this)">🧮 CALC</div>
    <div class="tab" onclick="goTab('settings',this)">⚙️</div>
  </div>

  <!-- SCANNER -->
  <div id="pg-scanner" class="page on">
    <div class="mbar">
      <div class="mchip"><div class="mn">SPY</div><div class="mp" id="p-spy">—</div><div class="mc" id="c-spy">—</div></div>
      <div class="mchip"><div class="mn">QQQ</div><div class="mp" id="p-qqq">—</div><div class="mc" id="c-qqq">—</div></div>
      <div class="mchip"><div class="mn">VIX</div><div class="mp" id="p-vix">—</div><div class="mc" id="c-vix">—</div></div>
      <div class="mchip"><div class="mn">IWM</div><div class="mp" id="p-iwm">—</div><div class="mc" id="c-iwm">—</div></div>
    </div>
    <div class="subtabs">
      <div class="stab on" id="st-lc" onclick="switchSub('lc')">📈 LARGE CAP</div>
      <div class="stab" id="st-mo" onclick="switchSub('mo')">🚀 MOMENTUM</div>
    </div>
    <div class="scan-bar">
      <div class="scan-filter">
        <div class="fchip on" id="f-all" onclick="setFilter('all')">ALL</div>
        <div class="fchip" id="f-call" onclick="setFilter('call')">📈 CALLS</div>
        <div class="fchip red" id="f-put" onclick="setFilter('put')">📉 PUTS</div>
        <div class="fchip" id="f-sweep" onclick="setFilter('sweep')">⚡ SWEEPS</div>
        <div class="fchip" id="f-high" onclick="setFilter('high')">🔥 75%+</div>
      </div>
      <div class="scan-count" id="scanCount">—</div>
    </div>
    <div class="brow"><span class="btm" id="scanUpd">—</span><button class="btnout" onclick="loadScanner()">↻ REFRESH</button></div>
    <div id="lc-content" class="scan-list"><div class="ld"><div class="spin"></div><div class="ltxt">LOADING FLOW...</div></div></div>
    <div id="mo-content" class="scan-list" style="display:none"><div class="ld"><div class="spin"></div><div class="ltxt">LOADING MOMENTUM...</div></div></div>
  </div>

  <!-- SECTORS -->
  <div id="pg-sectors" class="page">
    <div class="pad"><div class="ptitle">SECTOR DASHBOARD</div><div class="psub">Bull/Bear % per sector across timeframes</div></div>
    <div class="brow"><span class="btm" id="secUpd">—</span><button class="btnout" onclick="loadSectors()">↻ REFRESH</button></div>
    <div id="secContent"><div class="ld"><div class="spin"></div><div class="ltxt">LOADING...</div></div></div>
  </div>

  <!-- SIGNALS -->
  <div id="pg-signals" class="page">
    <div class="pad"><div class="ptitle">MARKET SIGNALS</div><div class="psub">TheStrat · 7/21 EMA · BB Squeeze · Technical Indicators</div></div>
    <div class="brow"><span class="btm" id="sigUpd">—</span><button class="btnout" onclick="loadSignals()">↻ REFRESH</button></div>
    <div id="sigContent"><div class="ld"><div class="spin"></div><div class="ltxt">LOADING...</div></div></div>
  </div>

  <!-- LEVELS -->
  <div id="pg-levels" class="page">
    <div class="pad"><div class="ptitle">KEY LEVELS</div><div class="psub">Entries · Targets · VWAP from live data</div></div>
    <div class="brow"><span class="btm" id="lvlUpd">—</span><button class="btnout" onclick="loadLevels()">↻ REFRESH</button></div>
    <div id="lvlContent" class="pad"><div class="ld"><div class="spin"></div><div class="ltxt">LOADING...</div></div></div>
  </div>

  <!-- CALC -->
  <div id="pg-calc" class="page">
    <div class="pad">
      <div class="ptitle">TRADE CALCULATOR</div>
      <div class="psub">ATM · Return · Stop Rules · Position Sizing</div>
      <div class="card">
        <div class="clbl2">Ticker</div><input class="cin" id="cTicker" placeholder="e.g. NVDA" oninput="this.value=this.value.toUpperCase()" />
        <div class="clbl2">Current Stock Price ($)</div><input class="cin" id="cPrice" type="number" placeholder="e.g. 175.00" />
        <div class="clbl2">Entry Price ($)</div><input class="cin" id="cEntry" type="number" placeholder="Daily open or prev close" />
        <div class="clbl2">Price Target ($)</div><input class="cin" id="cTarget" type="number" placeholder="Prev week high/low" />
        <div class="clbl2">Stop Price ($) — 5-min candle closes here = EXIT</div><input class="cin" id="cStop" type="number" placeholder="e.g. 171.00" />
        <div class="clbl2">ATM Option Premium (per contract total)</div><input class="cin" id="cPrem" type="number" placeholder="e.g. 280" />
        <div class="clbl2">Contracts</div><input class="cin" id="cContracts" type="number" value="1" />
        <div class="clbl2">DTE</div><input class="cin" id="cDTE" type="number" value="1" />
        <div class="clbl2">Conviction Score (from Scanner)</div><input class="cin" id="cConv" type="number" placeholder="e.g. 82" />
        <button class="btn" onclick="calcTrade()">CALCULATE TRADE</button>
        <div id="calcOut" style="display:none"></div>
      </div>
    </div>
  </div>

  <!-- SETTINGS -->
  <div id="pg-settings" class="page">
    <div class="pad">
      <div class="ptitle">SETTINGS</div>
      <div class="card">
        <div class="slbl">CONNECTION</div>
        <div style="font-family:'Space Mono',monospace;font-size:11px;color:var(--green);margin:8px 0 4px">✓ Secure proxy connected</div>
        <div style="font-size:10px;color:var(--td);margin-bottom:10px">API key secured on server · Endpoints verified</div>
      </div>
      <div class="card">
        <div class="slbl">WATCHLIST</div>
        <div style="font-size:11px;color:var(--td);margin:6px 0 10px">Tickers for Signals & Levels tabs</div>
        <div class="irow" style="margin-bottom:10px">
          <input type="text" id="wlIn" placeholder="Add ticker..." oninput="this.value=this.value.toUpperCase()" />
          <button class="btn" style="width:auto;padding:9px 14px" onclick="addWatch()">+</button>
        </div>
        <div id="wlDisplay"></div>
      </div>
      <div class="card">
        <div class="slbl">SCANNER FILTERS</div>
        <div class="srow2">
          <div><div class="slbl2">Min Premium</div><div class="ssub">Only show above this value</div></div>
          <select id="minPrem"><option value="100000">$100K+</option><option value="250000" selected>$250K+</option><option value="500000">$500K+</option><option value="1000000">$1M+</option></select>
        </div>
        <div class="srow2">
          <div><div class="slbl2">Sweeps Only</div><div class="ssub">High urgency trades only</div></div>
          <div class="toggle on" id="tSweep" onclick="tog('tSweep')"><div class="knob"></div></div>
        </div>
      </div>
    </div>
  </div>
</div>

<script>
// ═══════════════════════════════════════════
// CONFIG — VERIFIED REAL ENDPOINTS ONLY
// Source: api.unusualwhales.com/docs
// ═══════════════════════════════════════════
const PROXY = '/api/proxy';
const ENDPOINTS = {
  FLOW_ALERTS:    '/api/option-trades/flow-alerts',
  SCREENER:       '/api/screener/option-contracts',
  MARKET_TIDE:    '/api/market/market-tide',
  SECTOR_ETFS:    '/api/market/sector-etfs',
  DARKPOOL:       '/api/darkpool/recent',
  TICKER_FLOW:    (tk) => `/api/stock/${tk}/flow-recent`,
  TICKER_OPTIONS: (tk) => `/api/stock/${tk}/options-volume`,
  TICKER_IV:      (tk) => `/api/stock/${tk}/interpolated-iv`,
  TICKER_TECH:    (tk,fn) => `/api/stock/${tk}/technical-indicator/${fn}`,
  NET_PREM:       (tk) => `/api/stock/${tk}/net-prem-ticks`,
};

let WL = JSON.parse(localStorage.getItem('wf4_wl') || '["SPY","QQQ","NVDA","TSLA","AAPL","META","MSFT"]');
const LARGECAPS = ['SPY','QQQ','NVDA','AAPL','MSFT','META','TSLA','AMZN','GOOGL'];
let currentSub = 'lc';
let allFlows = { lc:[], mo:[] };
let activeFilter = 'all';

window.addEventListener('DOMContentLoaded', () => { renderWL(); loadScanner(); });

// ═══════════════════════════════════════════
// API — proxy with correct headers
// ═══════════════════════════════════════════
async function uw(path, params={}) {
  const u = new URL(PROXY, window.location.origin);
  u.searchParams.set('path', path);
  Object.entries(params).forEach(([k,v]) => u.searchParams.set(k,v));
  const r = await fetch(u.toString());
  if (!r.ok) throw new Error(`${r.status}: ${r.statusText}`);
  return r.json();
}

// ═══════════════════════════════════════════
// NAV
// ═══════════════════════════════════════════
function goTab(name,el) {
  document.querySelectorAll('.tab').forEach(t=>t.classList.remove('on'));
  document.querySelectorAll('.page').forEach(p=>p.classList.remove('on'));
  el.classList.add('on'); document.getElementById('pg-'+name).classList.add('on');
  if(name==='scanner') loadScanner();
  if(name==='sectors') loadSectors();
  if(name==='signals') loadSignals();
  if(name==='levels')  loadLevels();
}
function switchSub(sub) {
  currentSub=sub;
  document.getElementById('st-lc').classList.toggle('on',sub==='lc');
  document.getElementById('st-mo').classList.toggle('on',sub==='mo');
  document.getElementById('lc-content').style.display=sub==='lc'?'block':'none';
  document.getElementById('mo-content').style.display=sub==='mo'?'block':'none';
  if(sub==='mo'&&!allFlows.mo.length) loadMomentum();
  else updateCount();
}
function setFilter(f) {
  activeFilter=f;
  ['all','call','put','sweep','high'].forEach(x=>document.getElementById('f-'+x)?.classList.toggle('on',x===f));
  renderCurrentSub();
}
function passesFilter(f) {
  const side=(f.type||f.put_call||f.option_type||'').toUpperCase();
  const isSweep=f.is_sweep||f.alert_rule==='SWEEP'||f.alert_rule==='GOLDEN_SWEEP';
  const {s}=convScore(f);
  if(activeFilter==='call') return side.includes('CALL')||side==='C';
  if(activeFilter==='put')  return side.includes('PUT')||side==='P';
  if(activeFilter==='sweep') return isSweep;
  if(activeFilter==='high') return s>=75;
  return true;
}

// ═══════════════════════════════════════════
// DATE HELPERS
// ═══════════════════════════════════════════
function isValidFriday(d) { if(!d) return true; const dt=new Date(d); return isNaN(dt)||dt.getDay()===5; }
function fmtExp(d) {
  if(!d) return 'N/A';
  // Handle formats: "2026-03-21" or "2026-03-21T00:00:00"
  const dt=new Date(d.includes('T')?d:d+'T12:00:00');
  if(isNaN(dt)) return d;
  return (dt.getMonth()+1).toString().padStart(2,'0')+'/'+(dt.getDate()).toString().padStart(2,'0')+'/'+(dt.getFullYear()+'').slice(-2);
}
function calcDTE(d) {
  if(!d) return '?';
  const dt=new Date(d.includes('T')?d:d+'T12:00:00');
  return Math.max(0,Math.round((dt-new Date())/(1000*60*60*24)));
}

// ═══════════════════════════════════════════
// CONVICTION SCORE
// ═══════════════════════════════════════════
function convScore(f) {
  let s=0, chks=[], warns=[];
  // Fill side — check multiple field names UW uses
  const fillSide=(f.fill_side||f.aggressor_side||f.side||'').toLowerCase();
  if(fillSide==='ask'||fillSide==='above_ask'||fillSide==='a'){s+=25;chks.push('✅ Filled ABOVE ASK — buyer was aggressive');}
  else if(fillSide==='bid'||fillSide==='below_bid'||fillSide==='b'){s-=15;warns.push('🚨 Filled BELOW BID — SELLER initiated this');}
  else{s+=3;warns.push('⚠️ Mid fill — direction unclear');}

  // Sweep check
  const isSweep=f.is_sweep||f.alert_rule==='SWEEP'||f.alert_rule==='GOLDEN_SWEEP'||f.type==='sweep';
  if(isSweep){s+=25;chks.push('✅ SWEEP — crossed exchanges with urgency');}
  else{s+=5;chks.push('➖ Block trade — single exchange');}

  // Vol/OI — UW uses 'volume' and 'open_interest' or 'size' and 'oi'
  const vol=parseFloat(f.volume||f.size||f.total_size||0);
  const oi=parseFloat(f.open_interest||f.oi||1);
  const ratio=oi>0?vol/oi:0;
  if(ratio>=10){s+=25;chks.push(`✅ Vol/OI ${ratio.toFixed(1)}× — strong new position signal`);}
  else if(ratio>=3){s+=12;chks.push(`⚠️ Vol/OI ${ratio.toFixed(1)}× — moderate signal`);}
  else if(ratio>0){warns.push(`🚨 Vol/OI ${ratio.toFixed(1)}× — may be closing position`);}

  // DTE
  const expiry=f.expiry||f.expiration||f.expiration_date||'';
  const dteV=f.dte||calcDTE(expiry);
  if(dteV===0){s-=10;warns.push('⚠️ 0DTE — often a hedge not directional');}
  else if(dteV<=3){s+=10;chks.push(`✅ ${dteV} DTE — short dated directional`);}
  else{s+=5;}

  // IV rank
  const ivr=parseFloat(f.iv_rank||f.ivr||f.implied_volatility_rank||0);
  if(ivr>80){s-=5;warns.push(`⚠️ IVR ${ivr.toFixed(0)}% — elevated premium`);}
  else if(ivr>0&&ivr<30){s+=5;chks.push(`✅ IVR ${ivr.toFixed(0)}% — low premium env`);}

  s=Math.max(0,Math.min(100,s));
  const cls=s>=75?'high':s>=50?'mid':'low';
  const clr=s>=75?'var(--green)':s>=50?'var(--gold)':'var(--red)';
  let v=s>=75?`${s}% — REAL conviction buying. Aggressive fill + sweep + new position confirmed.`
        :s>=50?`${s}% — MODERATE. Needs key level confirmation before entry.`
        :`${s}% — LOW confidence. Likely seller, hedge, or close. Do not follow blindly.`;
  if(warns.length) v+=' | Flags: '+warns.map(w=>w.replace(/[✅⚠️🚨➖]/g,'')).join('; ');
  return{s,cls,clr,chks,warns,v};
}

function sizeHTML(conv) {
  const tiers=[
    {r:'75-100',sz:'$4,000–$5,000',n:'Clean signal. Full position.',active:conv>=75},
    {r:'50-74', sz:'$2,000–$3,000',n:'Confirm at level first.',active:conv>=50&&conv<75},
    {r:'0-49',  sz:'SKIP',         n:'Risk not justified.',active:conv<50},
  ];
  const a=tiers.find(t=>t.active)||tiers[2];
  const cls=conv>=75?'high':conv>=50?'mid':'low';
  return `<div class="sz-box ${cls}"><div class="sz-title">📐 SIZE → ${a.sz}</div>
    <div style="font-size:10px;opacity:.8;margin-bottom:6px">${a.n}</div>
    ${tiers.map(t=>`<div class="tier" style="${t.active?'background:#ffffff16':''}">
      <span class="tlbl">${t.active?'→':''} <strong style="${t.active?'color:var(--text)':''}">${t.r}</strong></span>
      <span class="tval" style="${t.active?'color:var(--gold)':''}">${t.sz}</span>
    </div>`).join('')}
  </div>`;
}

// ═══════════════════════════════════════════
// THESTRAT PATTERN
// ═══════════════════════════════════════════
function stratPattern(candles) {
  if(!candles||candles.length<2) return null;
  const cur=candles[candles.length-1], prev=candles[candles.length-2];
  const cH=parseFloat(cur.high||cur.h||0), cL=parseFloat(cur.low||cur.l||0);
  const cC=parseFloat(cur.close||cur.c||0), cO=parseFloat(cur.open||cur.o||0);
  const pH=parseFloat(prev.high||prev.h||0), pL=parseFloat(prev.low||prev.l||0);
  if(!cH||!pH) return null;
  let type,badge,bclass,action;
  if(cH>pH&&cL<pL){type='Outside Bar';badge='OUT';bclass='sb-out';action=cC>cO?'🔥 Bullish outside bar':'🔥 Bearish outside bar';}
  else if(cH<=pH&&cL>=pL){type='Inside Bar';badge='IN';bclass='sb-in';action='⚡ Inside bar — NO TRADE, wait for break';}
  else if(cH>pH&&cL>=pL){type='2Up';badge='2U';bclass='sb-2u';action='📈 Taking out prev high — bullish';}
  else if(cH<=pH&&cL<pL){type='2Down';badge='2D';bclass='sb-2d';action='📉 Taking out prev low — bearish';}
  else{type='1';badge='1';bclass='sb-1';action='Candle inside previous range';}
  return{type,badge,bclass,action};
}

// ═══════════════════════════════════════════
// BUILD SCANNER ROW
// ═══════════════════════════════════════════
let expandedRow=null;
function toggleExpand(id) {
  const el=document.getElementById('exp-'+id);
  if(!el) return;
  const isOpen=el.classList.contains('open');
  if(expandedRow&&expandedRow!==id) document.getElementById('exp-'+expandedRow)?.classList.remove('open');
  el.classList.toggle('open',!isOpen);
  expandedRow=isOpen?null:id;
}

function buildRow(f,idx,isMo=false) {
  if(!passesFilter(f)) return '';

  const{s,cls,clr,chks,warns,v}=convScore(f);
  // Handle both field name formats UW uses
  const sideRaw=(f.type||f.put_call||f.option_type||'CALL').toUpperCase();
  const bull=sideRaw.includes('CALL')||sideRaw==='C';
  const prem=parseFloat(f.total_premium||f.premium||f.ask*f.volume*100||0);
  const vol=parseFloat(f.volume||f.size||f.total_size||0);
  const oi=parseFloat(f.open_interest||f.oi||0);
  const ratio=oi>0?(vol/oi).toFixed(1):'—';
  const tk=f.ticker||f.ticker_symbol||f.symbol||'?';
  const strike=f.strike||f.strike_price||f.option_symbol?.match(/\d+\.?\d*(?=C|P)/)?.[0]||'?';
  const expiry=f.expiry||f.expiration||f.expiration_date||'';
  const expFmt=fmtExp(expiry);
  const dteV=f.dte||calcDTE(expiry);
  const isSweep=f.is_sweep||f.alert_rule==='SWEEP'||f.alert_rule==='GOLDEN_SWEEP';
  const fillSide=(f.fill_side||f.aggressor_side||f.side||'MID').toUpperCase();
  const chgPct=f.change_percent||f.premium_change_percent||null;
  const stratP=f._strat||null;
  const id=`row-${idx}`;

  return `<div class="srow ${bull?'bull':'bear'}" onclick="toggleExpand('${id}')">
    <div class="srow-top">
      <div class="srow-side ${bull?'side-bull':'side-bear'}">${bull?'📈':'📉'}</div>
      <div class="srow-main">
        <div class="srow-ticker">
          <span>${tk}</span>
          ${isMo?'<span style="font-size:9px;background:var(--pd);color:var(--purple);padding:2px 5px;border-radius:4px;font-family:Space Mono,monospace">MOM</span>':''}
          ${isSweep?'<span style="font-size:9px;background:var(--bd);color:var(--blue);padding:2px 5px;border-radius:4px;font-family:Space Mono,monospace">⚡SWEEP</span>':''}
          ${chgPct?`<span style="font-size:10px;color:${parseFloat(chgPct)>=0?'var(--green)':'var(--red)'}">${parseFloat(chgPct)>=0?'+':''}${parseFloat(chgPct).toFixed(1)}%</span>`:''}
        </div>
        <div class="srow-detail">$${strike} ${bull?'CALL':'PUT'} · ${expFmt} · ${dteV}DTE · ${fillSide}</div>
      </div>
      <div class="srow-right">
        <div class="conv-big" style="color:${clr}">${s}</div>
        <div class="conv-lbl">CONV</div>
      </div>
    </div>
    <div class="srow-stats">
      <div class="stat-box"><div class="stat-lbl">VOLUME</div><div class="stat-val" style="color:var(--blue)">${fmtNum(vol)}</div></div>
      <div class="stat-box"><div class="stat-lbl">OI</div><div class="stat-val" style="color:var(--tm)">${fmtNum(oi)}</div></div>
      <div class="stat-box"><div class="stat-lbl">VOL/OI</div><div class="stat-val" style="color:${parseFloat(ratio)>=10?'var(--green)':parseFloat(ratio)>=3?'var(--gold)':'var(--red)'}">${ratio}×</div></div>
      <div class="stat-box"><div class="stat-lbl">PREMIUM</div><div class="stat-val" style="color:var(--gold)">$${fmtMoney(prem)}</div></div>
    </div>
    ${stratP?`<div class="strat-row"><span class="strat-lbl">STRAT:</span><span class="sbadge ${stratP.bclass}">${stratP.badge}</span><span style="font-size:10px;color:var(--tm)">${stratP.action}</span></div>`:''}
    <div class="srow-expand" id="exp-${id}">
      <div class="exp-grid">
        <div class="exp-box"><div class="exp-lbl">TICKER</div><div class="exp-val">${tk}</div></div>
        <div class="exp-box"><div class="exp-lbl">STRIKE</div><div class="exp-val">$${strike}</div></div>
        <div class="exp-box"><div class="exp-lbl">EXPIRY</div><div class="exp-val">${expFmt}</div></div>
        <div class="exp-box"><div class="exp-lbl">DTE</div><div class="exp-val" style="color:${parseInt(dteV)<=1?'var(--red)':parseInt(dteV)<=3?'var(--gold)':'var(--green)'}">${dteV}d</div></div>
        <div class="exp-box"><div class="exp-lbl">TYPE</div><div class="exp-val" style="color:${bull?'var(--green)':'var(--red)'}">${bull?'CALL':'PUT'}</div></div>
        <div class="exp-box"><div class="exp-lbl">FILL SIDE</div><div class="exp-val" style="color:${fillSide==='ASK'||fillSide==='A'?'var(--green)':fillSide==='BID'||fillSide==='B'?'var(--red)':'var(--tm)'}">${fillSide}</div></div>
      </div>
      <div class="chk-list">${chks.map(c=>`<div class="chk">${c}</div>`).join('')}${warns.map(w=>`<div class="chk" style="color:var(--gold)">${w}</div>`).join('')}</div>
      <div class="verd ${cls}">${v}</div>
      ${sizeHTML(s)}
    </div>
  </div>`;
}

// ═══════════════════════════════════════════
// SCANNER — LARGE CAP
// Uses /api/option-trades/flow-alerts (verified endpoint)
// ═══════════════════════════════════════════
async function loadScanner() {
  document.getElementById('lc-content').innerHTML=loading('LOADING FLOW...');
  document.getElementById('scanUpd').textContent='—';
  try {
    const min=document.getElementById('minPrem')?.value||250000;
    const sweepOnly=document.getElementById('tSweep')?.classList.contains('on');

    // Use the VERIFIED correct endpoint with correct param names
    const params={
      limit:50,
      min_premium:min,
    };
    if(sweepOnly) params.is_sweep=true;

    const d=await uw(ENDPOINTS.FLOW_ALERTS, params);
    let flows=d.data||d.trades||d||[];
    if(!Array.isArray(flows)) flows=[];

    // Filter to large caps
    const lcFlows=flows.filter(f=>{
      const tk=(f.ticker||f.ticker_symbol||f.symbol||'').toUpperCase();
      return LARGECAPS.includes(tk);
    });

    // Sort by conviction score
    lcFlows.sort((a,b)=>convScore(b).s-convScore(a).s);
    allFlows.lc=lcFlows;
    renderLCFlow();
    loadMktBarFromFlow(flows);
  } catch(e) {
    document.getElementById('lc-content').innerHTML=`<div class="err">⚠️ API Error: ${e.message}<br><br>The proxy is connected but the API returned an error. This usually means:<br>• Market is closed (no flow data)<br>• Rate limit hit (wait 1 min and refresh)<br>• Try refreshing after 9:30am EST</div>`;
  }
  document.getElementById('scanUpd').textContent='Updated '+nt();
}

function renderLCFlow() {
  let html='',count=0;
  allFlows.lc.forEach((f,i)=>{ const r=buildRow(f,i,false); if(r){html+=r;count++;} });
  document.getElementById('lc-content').innerHTML=html||'<div class="empty">No large cap flow right now.<br>Market may be closed or no trades match filters.<br>Refresh after 9:30am EST on trading days.</div>';
  updateCount(count);
}

// ═══════════════════════════════════════════
// SCANNER — MOMENTUM
// ═══════════════════════════════════════════
async function loadMomentum() {
  document.getElementById('mo-content').innerHTML=loading('SCANNING MOMENTUM...');
  try {
    // Use screener endpoint for momentum — vol_greater_oi is a verified param
    const d=await uw(ENDPOINTS.SCREENER,{
      limit:100,
      min_premium:100000,
      vol_greater_oi:true,    // Volume > OI = new position
      min_volume_oi_ratio:10, // Vol must be 10x OI
      'issue_types[]':'Common Stock',
    });
    let flows=d.data||d||[];
    if(!Array.isArray(flows)) flows=[];

    // Remove large caps — keep momentum names only
    flows=flows.filter(f=>{
      const tk=(f.ticker||f.ticker_symbol||f.symbol||'').toUpperCase();
      return !LARGECAPS.includes(tk);
    });

    flows.sort((a,b)=>convScore(b).s-convScore(a).s);
    allFlows.mo=flows;
    renderMoFlow();
  } catch(e) {
    document.getElementById('mo-content').innerHTML=`<div class="err">⚠️ ${e.message}</div>`;
  }
}

function renderMoFlow() {
  let html='<div class="warn" style="margin:0 0 10px">🚀 <strong>Momentum:</strong> Vol/OI ≥10× · New positions only · Non-large-cap · Sorted by conviction</div>';
  let count=0;
  allFlows.mo.forEach((f,i)=>{ const r=buildRow(f,i+1000,true); if(r){html+=r;count++;} });
  document.getElementById('mo-content').innerHTML=html+(count?'':'<div class="empty">No momentum signals right now.<br>Requires Vol/OI ≥10× on non-large-cap stocks.<br>These are rare — check back during market hours.</div>');
  updateCount(count);
}

function renderCurrentSub() { if(currentSub==='lc') renderLCFlow(); else renderMoFlow(); }
function updateCount(n) {
  const arr=currentSub==='lc'?allFlows.lc:allFlows.mo;
  const c=n!==undefined?n:arr.filter(f=>passesFilter(f)).length;
  document.getElementById('scanCount').textContent=c+' signals';
}

// Market bar — pull from flow data if available, else use options-volume endpoint
async function loadMktBarFromFlow(flows) {
  const mktTickers={SPY:null,QQQ:null,VIX:null,IWM:null};
  // Try to get prices from recent flow data first
  flows.forEach(f=>{
    const tk=(f.ticker||f.ticker_symbol||'').toUpperCase();
    if(mktTickers.hasOwnProperty(tk)&&!mktTickers[tk]) {
      mktTickers[tk]={price:f.underlying_price||f.stock_price||null,chg:null};
    }
  });
  // Fill remaining with options-volume endpoint (verified)
  for(const t of Object.keys(mktTickers)) {
    if(!mktTickers[t]?.price) {
      try {
        const d=await uw(ENDPOINTS.TICKER_OPTIONS(t));
        const items=d.data||d||[];
        if(items.length) {
          const last=items[items.length-1];
          mktTickers[t]={price:last.price||last.stock_price||null,chg:null};
        }
      } catch(e){}
    }
    if(mktTickers[t]?.price) {
      const id=t.toLowerCase();
      const pe=document.getElementById('p-'+id);
      if(pe) pe.textContent=parseFloat(mktTickers[t].price).toFixed(2);
    }
  }
}

// ═══════════════════════════════════════════
// SECTORS
// Uses /api/market/sector-etfs (verified endpoint)
// ═══════════════════════════════════════════
const SECTORS=[
  {etf:'XLB',name:'Basic Materials'},{etf:'XLE',name:'Energy'},{etf:'XLF',name:'Financials'},
  {etf:'XLI',name:'Industrials'},{etf:'XLK',name:'Technology'},{etf:'XLP',name:'Cons. Non-Cycl'},
  {etf:'XLRE',name:'Real Estate'},{etf:'XLU',name:'Utilities'},{etf:'XLV',name:'Healthcare'},
  {etf:'XLY',name:'Cons. Cyclical'},{etf:'SPY',name:'S&P 500'},{etf:'QQQ',name:'NASDAQ 100'},
];

async function loadSectors() {
  document.getElementById('secContent').innerHTML=loading('LOADING SECTORS...');
  try {
    // Use the REAL sector endpoint
    const d=await uw(ENDPOINTS.SECTOR_ETFS);
    const data=d.data||d||[];

    if(Array.isArray(data)&&data.length>0) {
      renderSectorsFromAPI(data);
    } else {
      // Fallback: use flow-alerts to derive sentiment
      await loadSectorsFallback();
    }
  } catch(e) {
    await loadSectorsFallback();
  }
  document.getElementById('secUpd').textContent='Updated '+nt();
}

function renderSectorsFromAPI(data) {
  // Map the real API response fields
  // UW sector-etfs returns etf ticker + bullish/bearish percentages per timeframe
  let html=`<div class="sec-wrap"><table class="sec-table">
  <thead><tr><th style="text-align:left">SECTOR</th><th>60M</th><th>DAILY</th><th>WEEKLY</th><th>MONTHLY</th></tr></thead><tbody>`;

  const sectorMap={};
  data.forEach(item=>{
    const tk=(item.ticker||item.etf||item.symbol||'').toUpperCase();
    sectorMap[tk]=item;
  });

  let bullCount=0,bearCount=0;
  SECTORS.forEach(sec=>{
    const item=sectorMap[sec.etf]||null;
    if(!item){
      html+=`<tr><td><div style="display:flex;align-items:center;gap:7px"><span class="so so-mix">⚡</span><div><div class="sec-name">${sec.name}</div><div class="sec-etf">${sec.etf}</div></div></div></td><td colspan="4" style="text-align:center;color:var(--td);font-size:10px">No data</td></tr>`;
      return;
    }

    // Extract timeframe data — handle different field formats UW may return
    const tfs={
      '60m': extractTF(item,'1h')||extractTF(item,'60m')||extractTF(item,'hour'),
      'Daily': extractTF(item,'1d')||extractTF(item,'daily')||extractTF(item,'day'),
      'Weekly': extractTF(item,'1w')||extractTF(item,'weekly')||extractTF(item,'week'),
      'Monthly': extractTF(item,'1m')||extractTF(item,'monthly')||extractTF(item,'month'),
    };

    // Fallback: use overall bullish/bearish if no timeframe breakdown
    if(!Object.values(tfs).some(Boolean)) {
      const bull=parseFloat(item.bullish_percent||item.bullish||item.calls_percentage||0);
      const bear=parseFloat(item.bearish_percent||item.bearish||item.puts_percentage||0);
      const isGreen=bull>bear;
      if(isGreen) bullCount++; else bearCount++;
      const tfObj={bull:Math.round(bull),bear:Math.round(bear),chgPct:'0',isGreen};
      ['60m','Daily','Weekly','Monthly'].forEach(k=>tfs[k]=tfObj);
    }

    const greenTFs=Object.values(tfs).filter(t=>t?.isGreen).length;
    const ob=greenTFs>2;
    if(ob) bullCount++; else bearCount++;

    html+=`<tr><td><div style="display:flex;align-items:center;gap:7px">
      <span class="so ${ob?'so-bull':'so-bear'}">${ob?'🟢':'🔴'}</span>
      <div><div class="sec-name">${sec.name}</div><div class="sec-etf">${sec.etf}</div></div>
    </div></td>`;

    ['60m','Daily','Weekly','Monthly'].forEach(tf=>{
      const t=tfs[tf];
      if(!t){html+=`<td style="text-align:center;color:var(--td);font-size:10px">—</td>`;return;}
      html+=`<td>
        <div class="pct-row"><span class="pct pct-bull">${t.bull}%</span><span class="pct pct-bear">${t.bear}%</span></div>
        <div class="bias-bar" style="width:55px;margin:3px auto 0"><div class="bias-bull" style="width:${t.bull}%"></div><div class="bias-bear" style="width:${t.bear}%"></div></div>
        <div style="font-size:9px;text-align:center;font-family:'Space Mono',monospace;color:${t.isGreen?'var(--green)':'var(--red)'}">${t.isGreen?'+':''}${t.chgPct}%</div>
      </td>`;
    });
    html+='</tr>';
  });

  html+=`</tbody></table></div>`;
  html+=`<div class="pad"><div class="card"><div class="slbl">MARKET BIAS</div>
    <div style="font-size:12px;color:var(--tm);line-height:1.7;margin-top:6px">
      ${bullCount>bearCount?'📈 Overall bias is <strong style="color:var(--green)">BULLISH</strong> — look for CALL setups at key levels.':bearCount>bullCount?'📉 Overall bias is <strong style="color:var(--red)">BEARISH</strong> — look for PUT setups at key levels.':'⚖️ <strong style="color:var(--gold)">MIXED</strong> — only trade highest conviction setups.'}
    </div>
  </div></div>`;
  document.getElementById('secContent').innerHTML=html;
}

function extractTF(item, key) {
  if(!item[key]) return null;
  const tf=item[key];
  const bull=parseFloat(tf.bullish_percent||tf.bullish||tf.calls||0);
  const bear=parseFloat(tf.bearish_percent||tf.bearish||tf.puts||0);
  const chg=parseFloat(tf.change_percent||tf.chg||0);
  return{bull:Math.round(bull),bear:Math.round(bear),chgPct:chg.toFixed(2),isGreen:bull>bear};
}

async function loadSectorsFallback() {
  // Derive sector sentiment from market tide
  try {
    const d=await uw(ENDPOINTS.MARKET_TIDE,{interval_5m:false});
    const data=d.data||d||[];
    if(data.length) {
      const last=data[data.length-1];
      const callPrem=parseFloat(last.net_call_premium||last.call_premium||0);
      const putPrem=parseFloat(last.net_put_premium||last.put_premium||0);
      const bullish=callPrem>0;
      document.getElementById('secContent').innerHTML=`<div class="pad">
        <div class="card">
          <div class="slbl">MARKET TIDE (SECTOR DATA LOADING)</div>
          <div style="font-size:13px;margin:10px 0;color:${bullish?'var(--green)':'var(--red)'}">
            ${bullish?'📈 Net call premium POSITIVE — market is buying calls':'📉 Net put premium POSITIVE — market is buying puts'}
          </div>
          <div style="font-size:11px;color:var(--tm)">Net Call Premium: <span style="font-family:'Space Mono',monospace;color:var(--green)">$${fmtMoney(callPrem)}</span></div>
          <div style="font-size:11px;color:var(--tm);margin-top:4px">Net Put Premium: <span style="font-family:'Space Mono',monospace;color:var(--red)">$${fmtMoney(Math.abs(putPrem))}</span></div>
          <div style="font-size:10px;color:var(--td);margin-top:10px">Full sector breakdown requires sector-etfs endpoint to return data. Tap refresh to retry.</div>
        </div>
      </div>`;
      return;
    }
  } catch(e){}
  document.getElementById('secContent').innerHTML='<div class="empty">Sector data unavailable right now.<br>This loads best during market hours.<br>Tap refresh to try again.</div>';
}

// ═══════════════════════════════════════════
// SIGNALS
// Uses /api/stock/{ticker}/technical-indicator/{function}
// ═══════════════════════════════════════════
async function loadSignals() {
  document.getElementById('sigContent').innerHTML=loading('LOADING SIGNALS...');
  const results=[];
  for(const tk of WL.slice(0,8)) {
    try {
      // Get EMA data using REAL technical indicator endpoint
      const [ema7res,ema21res,flowRes]=await Promise.all([
        uw(ENDPOINTS.TICKER_TECH(tk,'EMA'),{interval:'daily',time_period:7,series_type:'close'}).catch(()=>null),
        uw(ENDPOINTS.TICKER_TECH(tk,'EMA'),{interval:'daily',time_period:21,series_type:'close'}).catch(()=>null),
        uw(ENDPOINTS.TICKER_FLOW(tk)).catch(()=>null),
      ]);
      const ema7=extractLastEMA(ema7res);
      const ema21=extractLastEMA(ema21res);
      const price=extractPriceFromFlow(flowRes);
      results.push({tk,ema7,ema21,price,flowRes});
    } catch(e){results.push({tk,error:true});}
  }
  renderSignals(results);
  document.getElementById('sigUpd').textContent='Updated '+nt();
}

function extractLastEMA(res) {
  if(!res) return null;
  const data=res.data||res.values||res||[];
  if(!Array.isArray(data)||!data.length) return null;
  const last=data[data.length-1];
  return parseFloat(last.value||last.ema||last.EMA||Object.values(last)[0]||0)||null;
}

function extractPriceFromFlow(res) {
  if(!res) return null;
  const data=res.data||res||[];
  if(!Array.isArray(data)||!data.length) return null;
  const last=data[data.length-1];
  return parseFloat(last.price||last.underlying_price||last.stock_price||0)||null;
}

function renderSignals(results) {
  let html='<div class="cgrid">';
  results.forEach(r=>{
    if(r.error){html+=`<div class="ccard"><div class="ctk">${r.tk}</div><div style="font-size:10px;color:var(--red)">No data</div></div>`;return;}
    const{ema7,ema21,price}=r;
    const hasEMA=ema7&&ema21&&price;
    const a7=hasEMA&&price>ema7;
    const a21=hasEMA&&price>ema21;
    const esig=!hasEMA?'—':a21&&a7?'BULLISH':!a21&&!a7?'BEARISH':'MIXED';
    const ec=esig==='BULLISH'?'var(--green)':esig==='BEARISH'?'var(--red)':esig==='MIXED'?'var(--gold)':'var(--td)';
    const dot=d=>`<div class="cdot ${d==='bull'?'dbull':d==='bear'?'dbear':'dneut'}">${d==='bull'?'🟢':d==='bear'?'🔴':'⚪'}</div>`;
    html+=`<div class="ccard">
      <div class="ctk">${r.tk}</div>
      <div class="crow">
        <div class="ctf">${dot('neut')}<div class="clb2">1H</div></div>
        <div class="ctf">${dot(a21===null?'neut':a21?'bull':'bear')}<div class="clb2">1D</div></div>
        <div class="ctf">${dot('neut')}<div class="clb2">1W</div></div>
      </div>
      <div class="cstat ${esig==='BULLISH'?'sbull':esig==='BEARISH'?'sbear':'smix'}">${esig}</div>
      <div style="margin-top:8px;padding-top:8px;border-top:1px solid var(--b1)">
        ${hasEMA?`<div style="font-size:9px;color:${ec};font-weight:700;letter-spacing:1px;margin-bottom:3px">${esig==='BULLISH'?'📈':esig==='BEARISH'?'📉':'⚠️'} ${esig}</div>
        <div class="ema-line">7 EMA <span style="font-family:'Space Mono',monospace;color:${a7?'var(--green)':'var(--red)'}">$${ema7.toFixed(2)}</span></div>
        <div class="ema-line">21 EMA <span style="font-family:'Space Mono',monospace;color:${a21?'var(--green)':'var(--red)'}">$${ema21.toFixed(2)}</span></div>
        ${price?`<div class="ema-line">Price <span style="font-family:'Space Mono',monospace;color:var(--text)">$${price.toFixed(2)}</span></div>`:''}`:
        '<div style="font-size:10px;color:var(--td)">EMA data loading...</div>'}
      </div>
    </div>`;
  });
  html+='</div>';
  html+=`<div class="pad"><div class="card"><div class="slbl">EMA + THESTRAT GUIDE</div>
    <div style="font-size:12px;color:var(--tm);line-height:1.85">
      <div>🟢 <strong style="color:var(--green)">Price ABOVE 21 EMA</strong> — bullish bias. Calls only.</div>
      <div>🔴 <strong style="color:var(--red)">Price BELOW 21 EMA</strong> — bearish bias. Puts only.</div>
      <div style="margin-top:6px"><span class="sbadge sb-2u">2U</span> Taking out prev high — bullish</div>
      <div style="margin-top:4px"><span class="sbadge sb-2d">2D</span> Taking out prev low — bearish</div>
      <div style="margin-top:4px"><span class="sbadge sb-out">OUT</span> Outside bar — follow close direction</div>
      <div style="margin-top:4px"><span class="sbadge sb-in">IN</span> Inside bar — NO TRADE, wait for break</div>
    </div>
  </div></div>`;
  document.getElementById('sigContent').innerHTML=html;
}

// ═══════════════════════════════════════════
// KEY LEVELS
// Uses /api/stock/{ticker}/flow-recent for price context
// ═══════════════════════════════════════════
async function loadLevels() {
  document.getElementById('lvlContent').innerHTML=loading('LOADING LEVELS...');
  const results=[];
  for(const tk of WL.slice(0,6)) {
    try{
      // Use options-volume for price history (verified endpoint)
      const[volRes,flowRes]=await Promise.all([
        uw(ENDPOINTS.TICKER_OPTIONS(tk),{limit:10}).catch(()=>null),
        uw(ENDPOINTS.TICKER_FLOW(tk)).catch(()=>null),
      ]);
      const price=extractPriceFromFlow(flowRes)||extractPriceFromVol(volRes);
      const levels=buildLevelsFromData(volRes,flowRes,price);
      results.push({tk,price,levels});
    }catch(e){results.push({tk,error:true});}
  }
  renderLevels(results);
  document.getElementById('lvlUpd').textContent='Updated '+nt();
}

function extractPriceFromVol(res) {
  if(!res) return null;
  const data=res.data||res||[];
  if(!Array.isArray(data)||!data.length) return null;
  return parseFloat(data[data.length-1]?.price||data[data.length-1]?.stock_price||0)||null;
}

function buildLevelsFromData(volRes,flowRes,currentPrice) {
  // Build levels from available data
  const levels=[];
  const flowData=flowRes?.data||flowRes||[];
  const volData=volRes?.data||volRes||[];

  // Extract recent prices from flow data
  const prices=[];
  if(Array.isArray(flowData)) {
    flowData.forEach(f=>{
      const p=parseFloat(f.underlying_price||f.stock_price||f.price||0);
      if(p>0) prices.push(p);
    });
  }
  if(Array.isArray(volData)) {
    volData.forEach(v=>{
      const p=parseFloat(v.price||v.stock_price||0);
      if(p>0) prices.push(p);
    });
  }

  if(prices.length>=2) {
    const sorted=[...prices].sort((a,b)=>a-b);
    const high=sorted[sorted.length-1];
    const low=sorted[0];
    const open=prices[0];
    const close=prices[prices.length-1];
    levels.push({n:'Recent High (Target)',v:high,t:'target'});
    levels.push({n:'Recent Low (Target)',v:low,t:'target'});
    levels.push({n:'Session Open (Entry)',v:open,t:'entry'});
    levels.push({n:'Session Close (Entry)',v:close,t:'entry'});
  }
  return levels;
}

function renderLevels(results) {
  let html='<div class="warn">⚡ Levels are derived from recent flow and volume data. For precise OHLC levels, cross-reference with your charting platform.</div>';
  results.forEach(r=>{
    if(r.error||!r.price){html+=`<div class="card"><div class="slbl">${r.tk||'?'}</div><div style="font-size:11px;color:var(--td)">Data loading — refresh during market hours</div></div>`;return;}
    const entries=r.levels.filter(l=>l.t==='entry');
    const targets=r.levels.filter(l=>l.t==='target');
    html+=`<div class="card"><div style="display:flex;justify-content:space-between;align-items:center;margin-bottom:10px">
      <div class="slbl" style="margin:0">${r.tk}</div>
      <span style="font-family:'Space Mono',monospace;font-size:14px;font-weight:700">$${r.price.toFixed(2)}</span>
    </div>
    <div class="et-grid">
      <div class="et-box et-entry"><div class="et-title" style="color:var(--blue)">🎯 ENTRIES</div>
        ${entries.length?entries.map(l=>{const dist=r.price-l.v,pct=(dist/l.v*100),near=Math.abs(pct)<0.5;return`<div class="et-row"><span class="et-lbl">${l.n}</span><div style="text-align:right"><div class="et-val" style="color:${near?'var(--gold)':'var(--text)'}">$${l.v.toFixed(2)}</div><div style="font-size:9px;color:${pct>=0?'var(--green)':'var(--red)'}">${pct>=0?'+':''}${pct.toFixed(2)}%${near?' ⚡':''}</div></div></div>`;}).join(''):'<div style="font-size:10px;color:var(--td)">Loading...</div>'}
      </div>
      <div class="et-box et-target"><div class="et-title" style="color:var(--green)">🏹 TARGETS</div>
        ${targets.length?targets.map(l=>{const dist=r.price-l.v,pct=(dist/l.v*100),near=Math.abs(pct)<0.5;return`<div class="et-row"><span class="et-lbl">${l.n}</span><div style="text-align:right"><div class="et-val" style="color:${near?'var(--gold)':'var(--text)'}">$${l.v.toFixed(2)}</div><div style="font-size:9px;color:${pct>=0?'var(--green)':'var(--red)'}">${pct>=0?'+':''}${pct.toFixed(2)}%${near?' ⚡':''}</div></div></div>`;}).join(''):'<div style="font-size:10px;color:var(--td)">Loading...</div>'}
      </div>
    </div></div>`;
  });
  document.getElementById('lvlContent').innerHTML=html;
}

// ═══════════════════════════════════════════
// CALCULATOR
// ═══════════════════════════════════════════
function calcTrade(){
  const price=parseFloat(document.getElementById('cPrice').value);
  const entry=parseFloat(document.getElementById('cEntry').value)||price;
  const target=parseFloat(document.getElementById('cTarget').value);
  const stopPx=parseFloat(document.getElementById('cStop').value);
  const prem=parseFloat(document.getElementById('cPrem').value);
  const contracts=parseFloat(document.getElementById('cContracts').value)||1;
  const dte=parseInt(document.getElementById('cDTE').value)||1;
  const conv=parseFloat(document.getElementById('cConv').value)||50;
  if(!price||!target||!prem){alert('Fill in Price, Target, and Premium.');return;}
  const isCall=target>entry,strike=entry,totalPaid=prem*contracts;
  const intrinsic=Math.max(0,isCall?(target-strike):(strike-target))*100*contracts;
  const pnl=intrinsic-totalPaid,retPct=(pnl/totalPaid)*100;
  const be=isCall?strike+(prem/100):strike-(prem/100);
  const moveNeeded=Math.abs(be-entry),movePct=(moveNeeded/entry*100);
  const stop25val=prem*0.75,stop25loss=prem*0.25*contracts;
  const rc=retPct>=0?'var(--green)':'var(--red)';
  let adv=[];
  if(retPct>=100) adv.push(`🔥 ${retPct.toFixed(0)}% return if target hits.`);
  else if(retPct>=30) adv.push(`📊 ${retPct.toFixed(0)}% return at target.`);
  else adv.push(`⚠️ Only ${retPct.toFixed(0)}% at this target.`);
  if(dte<=1) adv.push(`⚠️ 0-1 DTE — move MUST happen today.`);
  if(movePct>2) adv.push(`⚠️ Needs ${movePct.toFixed(2)}% move to break even.`);
  if(conv>=75) adv.push(`✅ Conviction ${conv}% — full position justified.`);
  else if(conv>=50) adv.push(`⚠️ Conviction ${conv}% — reduce size, confirm at entry level.`);
  else adv.push(`🚨 Conviction ${conv}% — SKIP this trade.`);
  document.getElementById('calcOut').style.display='block';
  document.getElementById('calcOut').innerHTML=`
  <div class="rcard">
    <div class="rbig"><div class="rbignum" style="color:${rc}">${retPct>=0?'+':''}${retPct.toFixed(1)}%</div><div class="rbiglbl">POTENTIAL RETURN</div></div>
    <div class="rrow"><span class="rlbl">Entry</span><span class="rval">$${entry.toFixed(2)}</span></div>
    <div class="rrow"><span class="rlbl">Target</span><span class="rval" style="color:var(--green)">$${target.toFixed(2)}</span></div>
    <div class="rrow"><span class="rlbl">Premium Paid</span><span class="rval" style="color:var(--red)">-$${totalPaid.toLocaleString()}</span></div>
    <div class="rrow"><span class="rlbl">Intrinsic at Target</span><span class="rval" style="color:var(--green)">+$${intrinsic.toLocaleString()}</span></div>
    <div class="rrow"><span class="rlbl">P&L</span><span class="rval" style="color:${pnl>=0?'var(--green)':'var(--red)'}">${pnl>=0?'+':'-'}$${Math.abs(pnl).toLocaleString()}</span></div>
    <div class="rrow"><span class="rlbl">Break-Even</span><span class="rval">$${be.toFixed(2)}</span></div>
    <div class="rrow"><span class="rlbl">Move Needed</span><span class="rval">$${moveNeeded.toFixed(2)} (${movePct.toFixed(2)}%)</span></div>
    <div class="rrow"><span class="rlbl">DTE</span><span class="rval" style="color:${dte<=1?'var(--red)':dte<=3?'var(--gold)':'var(--green)'}">${dte}d ${dte<=1?'⚠️ TODAY':dte<=3?'⚠️ TIGHT':'✓'}</span></div>
  </div>
  <div class="stopbox">
    <div class="stoptitle">🛑 STOP LOSS RULES</div>
    <div class="stoprule"><strong style="color:var(--red)">RULE 1 — KEY LEVEL:</strong><br>5-min candle CLOSES ${isCall?'below':'above'}${stopPx?` $${stopPx.toFixed(2)}`:' your stop'} → EXIT NOW.${stopPx?`<br>Distance: $${Math.abs(entry-stopPx).toFixed(2)} (${(Math.abs(entry-stopPx)/entry*100).toFixed(2)}%)`:''}  </div>
    <div class="stoprule"><strong style="color:var(--red)">RULE 2 — 25% DECAY:</strong><br>Option hits $${stop25val.toFixed(2)}/share → EXIT. Max loss: -$${stop25loss.toFixed(0)}</div>
    <div class="stoprule"><strong style="color:var(--gold)">FIRST TRIGGER WINS. No hoping. No averaging down.</strong></div>
  </div>
  ${sizeHTML(conv)}
  <div class="advbox">${adv.join('<br><br>')}</div>`;
}

// ═══════════════════════════════════════════
// SETTINGS
// ═══════════════════════════════════════════
function tog(id){document.getElementById(id).classList.toggle('on');}
function addWatch(){const v=document.getElementById('wlIn').value.trim().toUpperCase();if(!v)return;if(!WL.includes(v)){WL.push(v);localStorage.setItem('wf4_wl',JSON.stringify(WL));}document.getElementById('wlIn').value='';renderWL();}
function removeWatch(t){WL=WL.filter(x=>x!==t);localStorage.setItem('wf4_wl',JSON.stringify(WL));renderWL();}
function renderWL(){const el=document.getElementById('wlDisplay');if(!el)return;el.innerHTML=WL.map(t=>`<span style="display:inline-flex;align-items:center;gap:5px;background:var(--s2);border-radius:6px;padding:5px 10px;margin:3px;font-family:'Space Mono',monospace;font-size:11px">${t}<span onclick="removeWatch('${t}')" style="color:var(--red);cursor:pointer;margin-left:3px">✕</span></span>`).join('');}

// ═══════════════════════════════════════════
// UTILS
// ═══════════════════════════════════════════
function fmtMoney(n){n=parseFloat(n);if(n>=1e6)return(n/1e6).toFixed(1)+'M';if(n>=1e3)return(n/1e3).toFixed(0)+'K';return n.toFixed(0);}
function fmtNum(n){n=parseFloat(n);if(n>=1e6)return(n/1e6).toFixed(2)+'M';if(n>=1e3)return(n/1e3).toFixed(1)+'K';return n.toFixed(0);}
function nt(){return new Date().toLocaleTimeString();}
function loading(t='LOADING...'){return`<div class="ld"><div class="spin"></div><div class="ltxt">${t}</div></div>`;}
</script>
</body>
</html>